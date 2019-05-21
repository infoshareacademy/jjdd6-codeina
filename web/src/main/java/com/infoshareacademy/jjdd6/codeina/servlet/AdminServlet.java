package com.infoshareacademy.jjdd6.codeina.servlet;


import com.infoshareacademy.jjdd6.codeina.cdi.CryptoCurrencyAllInformations;
import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.hibernate.InformationDAO;
import com.infoshareacademy.jjdd6.codeina.hibernate.TableFiller;
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
import java.util.HashMap;
import java.util.Map;

@WebServlet("/lukjanadmin")
public class AdminServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(AdminServlet.class);

    @Inject
    private CryptoCurrencyAllInformations cryptoCurrencyAllInformations;

    @Inject
    private LoadingAllCryptocurrenciesService loadingAllCryptocurrenciesService;

    @Inject
    private TableFiller tableFiller;

    @Inject
    private TemplateProvider templateProvider;

    @Inject
    private InformationDAO informationDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        cryptoCurrencyAllInformations.setListOfAllInformations(loadingAllCryptocurrenciesService.listOfCryptoInformation());

        Template template = templateProvider.getTemplate(getServletContext(), "admin.ftlh");
        Map<String, Object> model = new HashMap<>();
        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        informationDAO.deleteAll();

        logger.info("Whole database has been deleted !");


        tableFiller.fillTable(cryptoCurrencyAllInformations.getListOfAllInformations());

        logger.info("Database has been uploaded !");

        Template template = templateProvider.getTemplate(getServletContext(), "admin.ftlh");

        Map<String, Object> model = new HashMap<>();

        model.put("message", 1);
        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.error(e.getMessage());
        }
    }
}
