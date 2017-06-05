import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")

public class HelloWorldServlet extends HttpServlet {

    protected void doGet(                            // represents input doGet or doPost
            HttpServletRequest request, HttpServletResponse response
        ) throws IOException {

        response.setContentType("text/html");       // represents output
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World 2</h1>");
        out.println("<p> This is example</p>");
    }
}