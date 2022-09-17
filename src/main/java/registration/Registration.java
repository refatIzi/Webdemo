package registration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/registration.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String uri = req.getRequestURI();

        // resp.getWriter().write("Method doPost\nURI: " + uri + "\nParams:\n" + params + "\n");
        //resp.getWriter().write("Method doPost\nURI: " + uri + "\n");

        BufferedReader reader = req.getReader();
        int intValueOfChar;
        StringBuilder result = new StringBuilder();
        while ((intValueOfChar = reader.read()) != -1) {
            result.append((char) intValueOfChar);
        }

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html>\n" + "<body>\n" + "<p>" + result.toString() + "</p>\n" + "</body>\n" + "</html>");
        // printWriter.write("Page was visited " + visitCounter + " times.");
        printWriter.close();
    }
}