package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyAllInformations;
import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyInformation;
import com.infoshareacademy.jjdd6.codeina.cdi.TableInfo;
import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.service.CryptoInformationService;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/table")
public class TableInformationServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(TableInformationServlet.class);

    @Inject
    private CryptoCurrencyAllInformations cryptoCurrencyAllInformations;

    @Inject
    private CryptoInformationService cryptoInformationService;

    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (cryptoCurrencyAllInformations == null) {
            resp.sendRedirect("error");
            return;
        }
        Map<String, Object> model = new HashMap<>();

        List<TableInfo> tableInfos = new ArrayList<>();

        cryptoCurrencyAllInformations.getListOfAllInformations().forEach(i -> putTableInfoIntoModel(i, tableInfos));

        model.put("table", tableInfos);

        Template template = templateProvider.getTemplate(req.getServletContext(), "cryptocurrencies.ftlh");

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.error(e.getMessage());
        }

    }

    private List<TableInfo> putTableInfoIntoModel(CryptoCurrencyInformation information, List<TableInfo> list) {
        Double marketCap = cryptoInformationService.getLastDate(information.getCryptoCurrencies()).getMarketCap();
        Double price = cryptoInformationService.getLastDate(information.getCryptoCurrencies()).getPrice();
        String date = cryptoInformationService.getLastDate(information.getCryptoCurrencies()).getDate().toString();
        Double change = cryptoInformationService.changeOverNight(information.getShortName()) * 100;
        String fullName = information.getFullName();
        final DecimalFormat df = new DecimalFormat("0");
        final DecimalFormat df2 = new DecimalFormat("0.000");
        final DecimalFormat df3 = new DecimalFormat("0.00");
        String marketCapString = df.format(marketCap);
        String priceString = df2.format(price).replace(',', '.');
        String changeStr = df3.format(change).replace(',', '.') + "%";
        boolean growth = change >= 0;
        changeStr = growth ? "+" + changeStr : changeStr;

        TableInfo tableInfo = new TableInfo(marketCapString, fullName, priceString, changeStr, date, growth);

        list.add(tableInfo);
        return list;
    }


}
