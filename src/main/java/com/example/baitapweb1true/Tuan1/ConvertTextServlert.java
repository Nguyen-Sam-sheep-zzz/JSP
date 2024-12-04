package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "convertText", value = "/convertText")
public class ConvertTextServlert extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("lowercase");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1> Your input: " + text + "</h1>");
        writer.println("<h1> Upper case: " + text.toUpperCase() + "</h1>");
        writer.println("</html>");
    }
}
