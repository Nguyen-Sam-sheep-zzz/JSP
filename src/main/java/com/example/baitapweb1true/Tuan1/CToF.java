package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cToF", value = "/conversion")
public class CToF extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double input = Double.parseDouble(req.getParameter("cToF"));
        double output = (input * 1.8) + 32;
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<h1> Convert temperature from C = " + input + " to F = " + output + "</h1>");
        writer.println("</html>");
    }
}

