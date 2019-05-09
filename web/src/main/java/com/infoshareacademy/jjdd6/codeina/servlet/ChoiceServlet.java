package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.codeina.cdi.StatisticData;
import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.service.CryptoService;
import com.infoshareacademy.jjdd6.codeina.service.LoadProperties;
import freemarker.template.SimpleDate;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.logging.Logger;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.joining;

@WebServlet("choice")
public class ChoiceServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(ChoiceServlet.class.getName());

    @Inject
    private TemplateProvider templateProvider;

    @Inject
    private CryptoService cryptoService;

    @Inject
    private StatisticData statisticData;

    @Inject
    private LoadProperties loadProperties;

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

        String choice = req.getParameter("crypto");
        String firstDateStr = req.getParameter("firstDate");
        String lastDateStr = req.getParameter("lastDate");

        LocalDate firstDate = getLocalDateFromString(firstDateStr);
        LocalDate lastDate = getLocalDateFromString(lastDateStr);

        statisticData.setStatisticDataMap(statisticData.addValue(choice, statisticData.getStatisticDataMap()));

        String path = loadProperties.getSettingsFile();


        String filePath = path + choice + ".csv";

        Map<String, Object> model = new HashMap<>();

        CryptoCurrency cryptoCurrency = cryptoService.getNewestDate(filePath);
        Double median = cryptoService.getMedian(filePath, firstDate, lastDate);
        Double average = cryptoService.getAverage(filePath, firstDate, lastDate);
        CryptoCurrency lowestValue = cryptoService.getLowestValue(filePath, firstDate, lastDate);
        CryptoCurrency highestValue = cryptoService.getHighestValue(filePath, firstDate, lastDate);

        Double changeOverNight = cryptoService.changeOverNight(filePath);

        model.put("lastPrice", priceFormatter(cryptoCurrency.getPrice()));
        model.put("median", priceFormatter(median));
        model.put("average", priceFormatter(average));
        model.put("lowestPrice", priceFormatter(lowestValue.getPrice()));
        model.put("highestPrice", priceFormatter(highestValue.getPrice()));
        if (changeOverNight >= 0) {
            model.put("positive", 1);
            model.put("changeOverNight", "+" + percentageFormatter(changeOverNight));
        } else model.put("changeOverNight", percentageFormatter(changeOverNight));

        String choiceName = shortNameToFullCryptocurrencyName(choice);

        model.put("choice", choiceName);
        model.put("firstDate", simpleDateDisplay(firstDateStr));
        model.put("lastDate", simpleDateDisplay(lastDateStr));

        List<CryptoCurrency> list = cryptoService.getAllCryptoCurrenciesInRange(filePath, firstDate, lastDate);

        String dates = list.stream()
                .map(CryptoCurrency::getDate)
                .map(LocalDate::toString)
                .collect(joining(","));

        String prices = list.stream()
                .map(CryptoCurrency::getPrice)
                .map(String::valueOf)
                .collect(joining(","));

        model.put("lowestValueDate", lowestValue.getDate());

        model.put("dates", dates);
        model.put("prices", prices);

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

    private String priceFormatter(Double price) {
        final DecimalFormat df = new DecimalFormat("0.000000");
        return (df.format(price) + " USD")
                .replace(',', '.');
    }

    private String percentageFormatter(Double number) {
        final DecimalFormat df = new DecimalFormat("0.00");
        return (df.format(number * 100) + " %")
                .replace(',', '.');
    }

    private static String simpleDateDisplay(String date) {
        long dateLong = Long.parseLong(date);
        Date dateEpoch = new Date(dateLong);
        SimpleDateFormat jdf = new SimpleDateFormat("dd-MM-yyyy");
        return jdf.format(dateEpoch);
    }
    private static String shortNameToFullCryptocurrencyName(String name){

        switch (name){
            case "btc": return "Bitcoin";
            case "bch": return "Bitcoin Cash";
            case "ltc": return "Litecoin";
            case "eth": return "Ethereum";
            case "vtc": return "Vertcoin";
            case "dcr": return "Decred";
            case "zec": return "ZCash";
            case "dash": return "Dash";
            case "doge": return "Dogecoin";
            case "pivx": return "PIVX";
            default: return "Cryptocurrency";
        }
    }
}

