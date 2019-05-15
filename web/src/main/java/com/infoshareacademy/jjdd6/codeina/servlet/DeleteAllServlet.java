package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.codeina.freemarker.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.hibernate.InformationDAO;
import com.infoshareacademy.jjdd6.codeina.service.InitialDataProvider;
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


@WebServlet("delete")
public class DeleteAllServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(DeleteAllServlet.class.getName());

    @Inject
    private InformationDAO informationDAO;

    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    informationDAO.deleteAll();

        Map<String,Object> model = new HashMap<>();

        model.put("m1","Successfully deleted whole database :-) ");

    Template template = templateProvider.getTemplate(getServletContext(),"admin");

        try {
            template.process(model,resp.getWriter());
        } catch (TemplateException e) {
            logger.severe(e.getMessage());
        }


    }
}
