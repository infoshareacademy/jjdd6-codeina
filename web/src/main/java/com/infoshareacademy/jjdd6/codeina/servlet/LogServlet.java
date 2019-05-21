package com.infoshareacademy.jjdd6.codeina.servlet;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.File;
        import java.io.IOException;
        import java.util.Scanner;

@WebServlet("/logs")
public class LogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();
        String path = "/opt/jboss/wildfly/standalone/log/server.log";
//        String path = "logs/logs.log";

        File file = new File(path);

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            sb.append(input.nextLine()).append("\n");
        }
        String output = sb.toString();
        resp.getWriter().println(output);
    }
}
