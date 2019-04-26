package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.cdi.StatisticData;
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


        Map<String, Object> model = new HashMap<>();
        Template template = templateProvider.getTemplate(getServletContext(), "test.ftlh");

        model.put("BTC", statisticData.getStatisticDataMap().get("btc"));
        model.put("BCH", statisticData.getStatisticDataMap().get("bch"));
        model.put("DASH", statisticData.getStatisticDataMap().get("dash"));
        model.put("DCR", statisticData.getStatisticDataMap().get("dcr"));
        model.put("LTC", statisticData.getStatisticDataMap().get("ltc"));
        model.put("PIVX", statisticData.getStatisticDataMap().get("pivx"));
        model.put("XEM", statisticData.getStatisticDataMap().get("xem"));
        model.put("ZEC", statisticData.getStatisticDataMap().get("zec"));
        model.put("DOGE", statisticData.getStatisticDataMap().get("doge"));
        model.put("ETH", statisticData.getStatisticDataMap().get("eth"));

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());;
        }
    }
}
