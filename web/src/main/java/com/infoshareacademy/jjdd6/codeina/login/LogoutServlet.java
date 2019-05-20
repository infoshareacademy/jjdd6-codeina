package com.infoshareacademy.jjdd6.codeina.login;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/logout"})
public class LogoutServlet extends HttpServlet {

    private String domain;
    private String clientId;

    @Override
    public void init(ServletConfig config) {
        domain = config.getServletContext().getInitParameter("com.auth0.domain");
        clientId = config.getServletContext().getInitParameter("com.auth0.clientId");
    }

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession() != null) {
            request.getSession().invalidate();
        }
        String returnUrl = String.format("%s://%s", request.getScheme(), request.getServerName());
        if ((request.getScheme().equals("http") && request.getServerPort() != 80) || (request.getScheme().equals("https") && request.getServerPort() != 443)) {
            returnUrl += ":" + request.getServerPort();
        }
        returnUrl += "/";
        String logoutUrl = String.format(
                returnUrl
        );
        response.sendRedirect(logoutUrl);
    }

}