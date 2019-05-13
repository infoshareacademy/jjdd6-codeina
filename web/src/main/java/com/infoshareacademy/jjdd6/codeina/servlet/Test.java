package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.codeina.hibernate.InformationDAO;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("test")
public class Test extends HttpServlet {

    @Inject
    InformationDAO informationDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.getWriter().println(informationDAO.getNewestDate("btc"));
        StringBuffer stringBuffer = new StringBuffer();
        informationDAO.getAllCryptoCurrenciesInRange("btc", LocalDate.of(2019, 05, 03), LocalDate.of(2019, 05, 05)).forEach(o -> stringBuffer.append(o.toString() + ", "));
        resp.getWriter().println(stringBuffer.toString());
    }
}
