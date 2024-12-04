package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "simpleCalculate", value = "/simpleCalculate")
public class SimpleCalculate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double inputA = Double.parseDouble(req.getParameter("inputA"));
        double inputB = Double.parseDouble(req.getParameter("inputB"));
        double result = 0;
        String operation = req.getParameter("operation");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        switch (operation) {
            case "+":
                result = inputA + inputB;
                writer.println("<h3>Result: " + inputA + " + " + inputB + " = " + result + "</h3>");
                break;
            case "-":
                result = inputA - inputB;
                writer.println("<h3>Result: " + inputA + " - " + inputB + " = " + result + "</h3>");
                break;
            case "x":
                result = inputA * inputB;
                writer.println("<h3>Result: " + inputA + " x " + inputB + " = " + result + "</h3>");
                break;
            case "/":
                if (inputB != 0) {
                    result = inputA / inputB;
                    writer.println("<h3>Result: " + inputA + " / " + inputB + " = " + result + "</h3>");
                } else {
                    writer.println("<h3>ERROR</h3>");
                }
                break;
            default:
                writer.println("<h3>ERROR</h3>");
        }
        writer.println("</html>");
    }
}
