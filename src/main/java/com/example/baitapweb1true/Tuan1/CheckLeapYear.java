package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "checkLeapYear", value = "/checkLeapYear")
public class CheckLeapYear extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int year = Integer.parseInt(req.getParameter("year"));
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if (year % 4 == 0) {
            writer.println("<h1>" + year + " is a leap year</h1>");
        } else {
            writer.println("<h1>" + year + " is not a leap year</h1>");
        }
        writer.println("</html>");

    }
}
