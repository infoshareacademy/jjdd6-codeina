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


        Map<String, Object> model = new HashMap<>();
        Template template = templateProvider.getTemplate(getServletContext(), "test.ftlh");
        int sumOfAll = statisticData.getStatisticDataMap().entrySet().stream().map(o -> o.getValue()).reduce(0, Integer::sum);
        if (statisticData.getStatisticDataMap().get("btc") != null) {
            model.put("BTC", statisticData.getStatisticDataMap().get("btc") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("bch") != null) {
            model.put("BCH", statisticData.getStatisticDataMap().get("bch") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("dash") != null) {
            model.put("DASH", statisticData.getStatisticDataMap().get("dash") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("dcr") != null) {
            model.put("DCR", statisticData.getStatisticDataMap().get("dcr") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("ltc") != null) {
            model.put("LTC", statisticData.getStatisticDataMap().get("ltc") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("pivx") != null) {
            model.put("PIVX", statisticData.getStatisticDataMap().get("pivx") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("zec") != null) {
            model.put("ZEC", statisticData.getStatisticDataMap().get("zec") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("doge") != null) {
            model.put("DOGE", statisticData.getStatisticDataMap().get("doge") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("eth") != null) {
            model.put("ETH", statisticData.getStatisticDataMap().get("eth") * 100 / sumOfAll);
        }
        if (statisticData.getStatisticDataMap().get("vtc") != null) {
            model.put("VTC", statisticData.getStatisticDataMap().get("vtc") * 100 / sumOfAll);
        }


        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }
    }
}
