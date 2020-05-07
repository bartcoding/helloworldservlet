package be.intecbrussel.servlets.helloworld;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/random")
public class RandomNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer =resp.getWriter();
        writer.println("<html>" +
                "<head><title>random number page</title></head>" +
                "<body><h1>" +
                "random number = " +
                   getRandomNumber()+
                "</h1></body>" +
                "</hmtl>");
        writer.close();
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
