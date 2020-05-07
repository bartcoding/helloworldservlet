package be.intecbrussel.servlets.helloworld;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/shout")
public class ShoutingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer =resp.getWriter();
        writer.println("<html>" +
                "<head><title>random number page</title></head>" +
                "<body>" +
                "<form method='post' action=\"\">\n" +
                "  <label for=\"fname\">what is your name?</label><br>\n" +
                "  <input type=\"text\" name=\"shoutname\" value='johnny'><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> " +
                "</body>" +
                "</hmtl>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer =resp.getWriter();
        writer.println("<html>" +
                "<head><title>random number page</title></head>" +
                "<body><h1>" +
                "you know I want to shout: " +
               req.getParameter("shoutname").toUpperCase() +
                "</h1></body>" +
                "</hmtl>");
        writer.close();
    }
}
