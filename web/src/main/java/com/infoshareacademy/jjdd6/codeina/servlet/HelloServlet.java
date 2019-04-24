package com.infoshareacademy.jjdd6.codeina.servlet;

import com.infoshareacademy.jjdd6.CryptoCurrency;
import com.infoshareacademy.jjdd6.TemplateProvider;
import com.infoshareacademy.jjdd6.codeina.service.CryptoService;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Inject
    TemplateProvider templateProvider ;

    @Inject
    CryptoService cryptoService ;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



//        String choice =req.getParameter("choice") ;


        Template template = templateProvider.getTemplate(getServletContext(),"index.ftlh");
        Map<String, String> model = new HashMap<>();

//        CryptoCurrency cryptoCurrency=  cryptoService.getNewestDate(choice);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");

//        LocalDate localDate = cryptoCurrency.getDate() ;
//        model.put("lastPrice",String.valueOf(cryptoCurrency.getPrice()));



        try {
            template.process(model,resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }

    }
}
