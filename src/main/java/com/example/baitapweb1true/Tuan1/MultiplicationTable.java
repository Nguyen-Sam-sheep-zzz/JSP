package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MultiplicationTable", value = "/multiplication")
public class MultiplicationTable extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double input = Double.parseDouble(req.getParameter("input"));

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if (input > 10) {
            writer.println("<h3> input < 10 </h3>");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            writer.println("<h3>" + input + " x " + i + " = " + (input * i) + "</h3>");
        }
        writer.println("</html>");
    }
}
