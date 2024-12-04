package com.example.baitapweb1true.Tuan1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "countCharactersServlet", value = "/CountCharacters")
public class CountCharactersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        String count = req.getParameter("count");
        writer.println("<html>");
        if (count.isEmpty()  || count == null ) {
            writer.println("<h1> Your character length: 0 </h1>");
        }
        else {
            writer.println("<h1> Your character:  " + count + "</h1>");
            writer.println("<h1> Length characters:  " + count.length() + "</h1>");
            writer.println("</html>");
        }
    }
}
