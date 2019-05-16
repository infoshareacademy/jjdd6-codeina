package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.codeina.hibernate.InformationDAO;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("delete")
public class DeleteAllServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(DeleteAllServlet.class.getName());

    @Inject
    private InformationDAO informationDAO;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        informationDAO.deleteAll();

        logger.info("Whole database has been deleted !");

        resp.sendRedirect("admin");

    }
}
