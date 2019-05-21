package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.codeina.cdi.SettingsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

@WebServlet("someservlet")
public class AdminSettingsServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(AdminSettingsServlet.class);

    @Inject
    private SettingsDAO settingsDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try {
            int i = Integer.valueOf(req.getParameter("number"));
            if (i < 6 && i >= 0) {
                settingsDAO.setDecimalPlaces(i);
                logger.info("number of decimal places has been updated to : " + i);
                resp.getWriter().print("Successfully updated number of decimal places to : " + i);
            } else {
                logger.warn("Updating failed number : " + i + " is out of range (0-5)");
                resp.getWriter().print("Number " + i + " is out of range (0-5)");
            }
        } catch (Exception e) {
            resp.getWriter().print("Not a number !");
            logger.error(e.getMessage());
        }
    }
}
