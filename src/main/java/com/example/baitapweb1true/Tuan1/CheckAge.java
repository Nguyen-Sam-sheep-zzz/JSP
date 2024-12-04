package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="checkAge", value = "/checkAge")
public class CheckAge extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int age = Integer.parseInt(req.getParameter("input"));
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        if (age >= 18) {
            out.println("<h1>You are of age</h1>");
        }
        else {
            out.println("<h1>you are not of legal age</h1>");
        }
        out.println("</html>");
    }
}
