package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyAllInformations;
import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyInformation;
import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.service.CryptoInformationService;
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
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@WebServlet("/table")
public class TableInformationServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(TableInformationServlet.class.getName());

    @Inject
    private CryptoCurrencyAllInformations cryptoCurrencyAllInformations;

    @Inject
    private CryptoInformationService cryptoInformationService ;

    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String,Object> model = new HashMap<>();


        Template template=templateProvider.getTemplate(req.getServletContext(),"cryptocurrencies.ftlh");

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }

    }


}