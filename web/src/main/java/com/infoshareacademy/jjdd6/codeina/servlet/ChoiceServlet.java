package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.cdi.StatisticData;
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
import java.util.Map;
import java.util.logging.Logger;

@WebServlet("choice")
public class ChoiceServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(ChoiceServlet.class.getName());

    @Inject
    private TemplateProvider templateProvider;

    @Inject
    CryptoService cryptoService;

    @Inject
    StatisticData statisticData;

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

        LocalDate fistDate = getLocalDateFromString(firstDateStr);
        LocalDate lastDate = getLocalDateFromString(lastDateStr);

        statisticData.setStatisticDataMap(statisticData.addValue(choice, statisticData.getStatisticDataMap()));


        String filePath = path + choice + ".csv";

        Map<String, Object> model = new HashMap<>();

        CryptoCurrency cryptoCurrency = cryptoService.getNewestDate(filePath);
        Double median = cryptoService.getMedian(filePath, fistDate, lastDate);
        Double average = cryptoService.getAverage(filePath, fistDate, lastDate);
        CryptoCurrency lowestValue = cryptoService.getLowestValue(filePath, fistDate, lastDate);
        CryptoCurrency highestValue = cryptoService.getHighestValue(filePath, fistDate, lastDate);
        model.put("lastPrice", cryptoCurrency);
        model.put("median", median);
        model.put("average", average);
        model.put("lowest", lowestValue);
        model.put("highest", highestValue);

        Template template = templateProvider.getTemplate(getServletContext(), "index.ftlh");

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }


    }

    private LocalDate getLocalDateFromString(String localDateStr) {
        return Instant.ofEpochMilli(Long.valueOf(localDateStr))
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}

