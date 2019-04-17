package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.service.CryptoService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selection")
public class CryptoCurrencySelection extends HttpServlet {
    @Inject
    TemplateProvider templateProvider ;

    @Inject
    CryptoService cryptoService ;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
