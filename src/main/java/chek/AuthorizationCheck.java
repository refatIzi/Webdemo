package chek;

import db.Control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/authorization")
public class AuthorizationCheck extends HttpServlet {

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
        String[] people = result.toString().split("&");

         String user=people[0].replaceAll("(^[a-zA-Z]*=)", "");
         String pass=people[1].replaceAll("(^[a-zA-Z]*=)", "");
       Control control= new Control();
        if(control.check(user+","+pass)) {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html>\n" + "<body>\n" + "<p>" + user + "</p>\n" +
                    "<p>" + pass + "</p>\n" +
                    "</body>\n" + "</html>");
            // printWriter.write("Page was visited " + visitCounter + " times.");
            printWriter.close();
        }else {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<html>\n" + "<body>\n" + "<p>No Authoristation"+user+","+pass+"</p>\n" +
                    "</body>\n" + "</html>");
            // printWriter.write("Page was visited " + visitCounter + " times.");
            printWriter.close();
        }
    }

}
