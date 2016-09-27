package ua.goit.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getResponse(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getResponse(req, resp);
    }

    private void getResponse(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        String title = "Using " + req.getMethod() + " Method to Read Forms Data";
        String docType = "<!doctype html public \"-//w3c//dtd/ html 4.0 transitional //en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title>" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>First Name</b>: " +
                req.getParameter("first_name") + "\n" +
                "  <li><b>Last Name</b>: " +
                req.getParameter("last_name") + "\n" +
                "</ul>\n" +
                "</body></html>");
    }
}
