package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.Downloader;
import com.infoshareacademy.jjdd6.TemplateProvider;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("choice")
public class ChoiceServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(ChoiceServlet.class.getName());


    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Template template = templateProvider.getTemplate(getServletContext(), "template.ftlh");
        try {
            template.process(null, resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }
        Downloader.downloadAll();
    }
}

