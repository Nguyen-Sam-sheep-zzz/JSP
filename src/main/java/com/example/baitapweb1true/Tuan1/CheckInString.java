package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "checkInString", value = "/checkString")
public class CheckInString extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = req.getParameter("string");
        resp.setContentType("text/html; charset=UTF-8");
        char inputC = req.getParameter("check").charAt(0);
        int count = 0;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h2> Your String: " + input + "</h2>");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == inputC) {
                count++;
            }
        }
        writer.println("<h2> Số lần xuất hiện của : " + inputC + " trong chuỗi là " + count + "</h2>");
        writer.println("</html>");
    }
}
