package com.infoshareacademy.jjdd6.codeina.servlet;

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

@WebServlet("/error")
public class ErrorMessageServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(ErrorMessageServlet.class.getName());

    @Inject
    private TemplateProvider templateProvider;

    private static String noStatisticsMessage = "¯\\_(ツ)_/¯ No statistic data available ¯\\_(ツ)_/¯";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Template template = templateProvider.getTemplate(getServletContext(), "error.ftlh");
        Map<String, Object> model = new HashMap<>();
        model.put("message", noStatisticsMessage);
        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }
    }
}
