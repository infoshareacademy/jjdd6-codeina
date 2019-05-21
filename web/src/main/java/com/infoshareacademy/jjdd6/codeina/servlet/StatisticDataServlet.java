package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.hibernate.StatisticsDAO;
import com.infoshareacademy.jjdd6.codeina.hibernate.StatisticsTable;
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
import java.util.List;
import java.util.Map;

@WebServlet("/statistics")
public class StatisticDataServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(ErrorMessageServlet.class);

    @Inject
    private TemplateProvider templateProvider;

    @Inject
    private StatisticsDAO statisticsDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        if (statisticsDAO.findAll() == null) {
            resp.sendRedirect("error");
            return;
        }

        Map<String, Object> model = new HashMap<>();

        List<StatisticsTable> statisticsTable = statisticsDAO.findAll();

        model.put("stats",statisticsTable);

        Template template = templateProvider.getTemplate(getServletContext(), "statistics.ftlh");

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.error(e.getMessage());
        }
    }
}

