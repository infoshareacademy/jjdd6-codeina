package com.infoshareacademy.jjdd6.codeina.servlet;


import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyAllInformations;
import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.hibernate.TableFiller;
import com.infoshareacademy.jjdd6.codeina.service.LoadingAllCryptocurrenciesService;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@WebServlet("admin")
public class AdminServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(AdminServlet.class.getName());

    @Inject
    private CryptoCurrencyAllInformations cryptoCurrencyAllInformations;

    @Inject
    private LoadingAllCryptocurrenciesService loadingAllCryptocurrenciesService;

    @Inject
    private TableFiller tableFiller;

    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Template template = templateProvider.getTemplate(getServletContext(), "admin.ftlh");
        Map<String, Object> model = new HashMap<>();
        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        cryptoCurrencyAllInformations.setListOfAllInformations(loadingAllCryptocurrenciesService.listOfCryptoInformation());

        tableFiller.fillTable(cryptoCurrencyAllInformations.getListOfAllInformations());

        Template template = templateProvider.getTemplate(getServletContext(), "admin.ftlh");

        Map<String, Object> model = new HashMap<>();

        model.put("message", 1);
        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }


    }
}
