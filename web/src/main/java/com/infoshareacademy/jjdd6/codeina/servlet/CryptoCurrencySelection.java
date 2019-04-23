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
import java.util.HashMap;
import java.util.Map;

@WebServlet("/selection")
public class CryptoCurrencySelection extends HttpServlet {

    @Inject
    TemplateProvider templateProvider ;

    @Inject
    CryptoService cryptoService ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String path = req.getParameter("outFilePath");

       String choice = req.getParameter("choice");

       StringBuilder sb = new StringBuilder();
       sb.append(path).append(choice).append(".csv") ;

       String filePath = sb.toString();

       Map<String, Object> model = new HashMap<>();

       CryptoCurrency cryptoCurrency=  cryptoService.getNewestDate(filePath);

//       resp.getWriter().println(cryptoCurrency.getPrice());
//       resp.getWriter().println(cryptoCurrency.getDate());
       model.put("choice",cryptoCurrency);

       Template template = templateProvider.getTemplate(getServletContext(),"test.ftlh");

        try {
            template.process(model,resp.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }


    }


}
