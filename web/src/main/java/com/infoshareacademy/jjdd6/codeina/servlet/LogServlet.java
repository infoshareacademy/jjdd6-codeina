package com.infoshareacademy.jjdd6.codeina.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

@WebServlet("/logs")
public class LogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int i = 0;
        while (flag) {
            try {
                String path;
                if (i == 0) {
                    path = System.getProperty("java.io.tmpdir") + "/userslogs.log";
                } else {
                    path = System.getProperty("java.io.tmpdir") + "/userslogs.log" + " (" + i + ")";
                }
                File file = new File(path);

                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    sb.append(input.nextLine());
                }
                i++;
            } catch (FileNotFoundException e) {
                flag=false;
            }
        }

        String output = sb.toString();
        resp.getWriter().println(output);
    }
}
