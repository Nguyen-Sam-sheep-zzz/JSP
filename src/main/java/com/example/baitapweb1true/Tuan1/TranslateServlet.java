package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", value = "/convertMoney")
public class TranslateServlet extends HttpServlet {
    public static Map<String, String> dictionary = new HashMap<String, String>();
    static {
        dictionary.put("apple", "qua tao");
        dictionary.put("banana", "qua chuoi");
        dictionary.put("potato", "cu khoai tay");
        dictionary.put("tomato", "qua ca chua");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputNameSearch = request.getParameter("inputName");

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");
        if (dictionary.get(inputNameSearch) != null) {
            printWriter.println("<h1>" + dictionary.get(inputNameSearch) + "</h1>");
        } else {
            printWriter.println("<h1>Name not found!</h1>");
        }
        printWriter.println("</html>");
    }
}
