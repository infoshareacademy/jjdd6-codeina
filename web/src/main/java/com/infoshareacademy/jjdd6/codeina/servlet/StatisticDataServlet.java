package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.codeina.cdi.StatisticData;
import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
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

@WebServlet("/statistics")
public class StatisticDataServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(StatisticDataServlet.class.getName());

    @Inject
    private StatisticData statisticData;
    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (statisticData.getStatisticDataMap() == null) {
            resp.sendRedirect("error");
            return;
        }
        Map<String, Object> model = new HashMap<>();
        Template template = templateProvider.getTemplate(getServletContext(), "test.ftlh");
        int sumOfAll = statisticData.getStatisticDataMap().entrySet().stream().map(o -> o.getValue()).reduce(0, Integer::sum);

        statisticData.getStatisticDataMap().keySet().forEach((o -> putPercentageStatisticsIntoModel(o, sumOfAll, model)));
        statisticData.getStatisticDataMap().keySet().forEach((o -> putStatisticsIntoModel(o, model)));

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }
    }

    private Map<String, Object> putPercentageStatisticsIntoModel(String cryptoName, int sumOfAll, Map<String, Object> model) {
        model.put(cryptoName, statisticData.getStatisticDataMap().get(cryptoName) * 100 / sumOfAll);
        return model;
    }

    private Map<String, Object> putStatisticsIntoModel(String cryptoName, Map<String, Object> model) {
        model.put(cryptoName + "Number", statisticData.getStatisticDataMap().get(cryptoName));
        return model;
    }
}
