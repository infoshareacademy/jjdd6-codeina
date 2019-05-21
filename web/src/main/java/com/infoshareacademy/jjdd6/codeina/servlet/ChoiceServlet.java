package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyAllInformations;
import com.infoshareacademy.jjdd6.codeina.cdi.SettingsDAO;
import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.hibernate.InformationDAO;
import com.infoshareacademy.jjdd6.codeina.hibernate.StatisticsDAO;
import com.infoshareacademy.jjdd6.codeina.service.LoadingAllCryptocurrenciesService;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
import java.util.logging.*;
import java.util.logging.Formatter;

import static java.util.stream.Collectors.joining;

@WebServlet("choice")
public class ChoiceServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(ChoiceServlet.class);


    @Inject
    private SettingsDAO settingsDAO;

    @Inject
    private TemplateProvider templateProvider;

    @Inject
    private InformationDAO informationDAO;

    @Inject
    private CryptoCurrencyAllInformations cryptoCurrencyAllInformations;

    @Inject
    private LoadingAllCryptocurrenciesService loadingAllCryptocurrenciesService;

    @Inject
    private StatisticsDAO statisticsDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        cryptoCurrencyAllInformations.setListOfAllInformations(loadingAllCryptocurrenciesService.listOfCryptoInformation());

        List<CryptoCurrency> cryptoCurrencies = informationDAO.getAllCryptoCurrencies("btc");
        LocalDate lastDate = informationDAO.getLastDate(cryptoCurrencies).getDate();

        String firstDateStr = getDateEpochFromLocalDate(lastDate.minusDays(30));
        String lastDateStr = getDateEpochFromLocalDate(lastDate);
        req.setAttribute("firstDate", firstDateStr);
        req.setAttribute("lastDate", lastDateStr);
        req.setAttribute("choice", "btc");
        req.setAttribute("get", true);

        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String choice, firstDateStr, lastDateStr;
        boolean get;
        try {
            get = (boolean) req.getAttribute("get");
        } catch (Exception e) {
            get = false;
        }

        if (get) {
            choice = (String) req.getAttribute("choice");
            firstDateStr = (String) req.getAttribute("firstDate");
            lastDateStr = (String) req.getAttribute("lastDate");

        } else {
            choice = req.getParameter("crypto");
            firstDateStr = req.getParameter("firstDate");
            lastDateStr = req.getParameter("lastDate");
        }

        LocalDate firstDate = getLocalDateFromString(firstDateStr);
        LocalDate lastDate = getLocalDateFromString(lastDateStr);

        Map<String, Object> model = new HashMap<>();

        List<CryptoCurrency> cryptoCurrencies = informationDAO.getAllCryptoCurrencies(choice);

        CryptoCurrency cryptoCurrencyFirst = informationDAO.getFirstDate(cryptoCurrencies);
        CryptoCurrency cryptoCurrencyLast = informationDAO.getLastDate(cryptoCurrencies);
        if (firstDate.compareTo(cryptoCurrencyFirst.getDate()) <= 0) {
            model.put("badRequest", String.format("Data out of range : %s - %s !", cryptoCurrencyFirst.getDate(), cryptoCurrencyLast.getDate()));
        } else if (firstDate.equals(lastDate) || cryptoCurrencyLast.getDate().equals(firstDate)) {
            model.put("badRequest", String.format("Choose more data in range : %s - %s !", cryptoCurrencyFirst.getDate(), cryptoCurrencyLast.getDate()));
        } else {

            statisticsDAO.update(choice);
            model = fillModelWithObjects(model, choice, firstDate, lastDate, firstDateStr, lastDateStr);
            logger.info("Cryptocurrency : ");


        }

        Template template = templateProvider.getTemplate(getServletContext(), "index.ftlh");

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.error(e.getMessage());
        }
    }

    private LocalDate getLocalDateFromString(String localDateStr) {
        return Instant.ofEpochMilli(Long.valueOf(localDateStr))
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    private String priceFormatter(Double price) {
        DecimalFormat df = new DecimalFormat("0.00000");
        if (settingsDAO.getDecimalPlaces() != null && settingsDAO.getDecimalPlaces() < 6 && settingsDAO.getDecimalPlaces() >= 0) {
            int i = settingsDAO.getDecimalPlaces();
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            for (int j = 0; j < i; j++) {
                if (j == 0) sb.append(".");
                sb.append("0");
            }
            df = new DecimalFormat(sb.toString());
        }
        return (df.format(price) + " USD")
                .replace(',', '.');
    }

    private String percentageFormatter(Double number) {
        final DecimalFormat df = new DecimalFormat("0.00");
        return (df.format(number * 100) + " %")
                .replace(',', '.');
    }

    public String shortNameToFullCryptocurrencyName(String name) {

        switch (name) {
            case "btc":
                return "Bitcoin";
            case "bch":
                return "Bitcoin Cash";
            case "ltc":
                return "Litecoin";
            case "eth":
                return "Ethereum";
            case "vtc":
                return "Vertcoin";
            case "dcr":
                return "Decred";
            case "zec":
                return "ZCash";
            case "dash":
                return "Dash";
            case "doge":
                return "Dogecoin";
            case "pivx":
                return "PIVX";
            default:
                return "Cryptocurrency";
        }
    }

    private static String simpleDateDisplay(String date) {
        long dateLong = Long.parseLong(date);
        Date dateEpoch = new Date(dateLong);
        SimpleDateFormat jdf = new SimpleDateFormat("dd-MM-yyyy");
        return jdf.format(dateEpoch);
    }

    private static String getDateEpochFromLocalDate(LocalDate localDate) {
        ZoneId zoneId = ZoneId.systemDefault();
        long epoch = localDate.atStartOfDay(zoneId).toEpochSecond() * 1000;
        return String.valueOf(epoch);
    }

    private Map<String, Object> fillModelWithObjects(Map<String, Object> model, String choice, LocalDate firstDate, LocalDate lastDate, String firstDateStr, String lastDateStr) {
        CryptoCurrency cryptoCurrency = informationDAO.getNewestDate(choice);
        Double median = informationDAO.getMedian(choice, firstDate, lastDate);
        Double average = informationDAO.getAverage(choice, firstDate, lastDate);
        CryptoCurrency lowestValue = informationDAO.getLowestValue(choice, firstDate, lastDate);
        CryptoCurrency highestValue = informationDAO.getHighestValue(choice, firstDate, lastDate);

        Double changeOverNight = informationDAO.changeOverNight(choice);

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

        List<CryptoCurrency> list = informationDAO.getAllCryptoCurrenciesInRange(choice, firstDate, lastDate);


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
        logger.info("User data : " + choiceName + " " + firstDate + " " + lastDate);

        return model;
    }
}

