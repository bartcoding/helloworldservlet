package be.intecbrussel.servlets.helloworld;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

@WebServlet("/Hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter  writer =resp.getWriter();
        writer.println("<html>" +
                "<head><title>helloWorld servlet page</title></head>" +

                "<body><h1>hello world</h1>" +
                "<p>" +
                "request method was: " +req.getMethod() +
                "</p></body>" +
                "</hmtl>");
        writer.close();
    }
}
