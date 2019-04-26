package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.Downloader;
import com.infoshareacademy.jjdd6.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.service.CryptoService;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static java.util.stream.Collectors.joining;

@WebServlet("choice")
public class ChoiceServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(ChoiceServlet.class.getName());

    @Inject
    private TemplateProvider templateProvider;

    @Inject
    CryptoService cryptoService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Template template = templateProvider.getTemplate(getServletContext(), "index.ftlh");
        try {
            template.process(null, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String path = req.getParameter("outFilePath");

        String choice = req.getParameter("crypto");

        String firstDateStr = req.getParameter("firstDate");
        String lastDateStr = req.getParameter("lastDate");

        LocalDate firstDate =
                Instant.ofEpochMilli(Long.valueOf(firstDateStr))
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();

        LocalDate lastDate =
                Instant.ofEpochMilli(Long.valueOf(lastDateStr))
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();


        String filePath = path + choice + ".csv";

        Map<String, Object> model = new HashMap<>();

        CryptoCurrency cryptoCurrency = cryptoService.getNewestDate(filePath);
        Double median = cryptoService.getMedian(filePath, firstDate, lastDate);
        Double average = cryptoService.getAverage(filePath, firstDate, lastDate);
        CryptoCurrency lowestValue = cryptoService.getLowestValue(filePath, firstDate, lastDate);
        CryptoCurrency highestValue = cryptoService.getHighestValue(filePath, firstDate, lastDate);
        model.put("lastPrice", cryptoCurrency);
        model.put("median", median);
        model.put("average", average);
        model.put("lowest", lowestValue);
        model.put("highest", highestValue);

        List<CryptoCurrency> list = cryptoService.getAllCryptoCurrenciesInRange(filePath,firstDate,lastDate);

        // TAK SIE NIE ROBI XD
        String dummyJson = "[ " + list.stream()
                .map(c -> "{ x: " + c.getDate() + ", y: " + c.getPrice() + "}")
                .collect(joining(",\n")) + " ]";

        String dates = list.stream()
                .map(CryptoCurrency::getDate)
                .map(LocalDate::toString)
                .collect(joining(","));

        String prices = list.stream()
                .map(CryptoCurrency::getPrice)
                .map(String::valueOf)
                .collect(joining(","));

        model.put("dates", dates);
        model.put("prices", prices);

        Template template = templateProvider.getTemplate(getServletContext(), "index.ftlh");

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }
                                // TODO wyswietlic akt krypto i zasieg
                                // TODO wykres

                                //TODO USUNAC NEMA!!!!!!! (xem)

    }
}

