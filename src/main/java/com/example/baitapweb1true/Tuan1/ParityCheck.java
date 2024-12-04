package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "parityCheck", value = "/check")
public class ParityCheck extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int input = Integer.parseInt(req.getParameter("input"));
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if (input % 2 == 0) {
            writer.println("<h1> " + input + " is even</h1>");
        } else {
            writer.println("<h1> " + input + " is odd</h1>");
        }
        writer.println("</html>");
    }
}
