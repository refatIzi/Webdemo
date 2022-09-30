package info;

import db.Control;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/account")
public class InfoAccount extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        // resp.sendRedirect("/account.jsp");
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/account.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        BufferedReader reader = req.getReader();
        int intValueOfChar;
        StringBuilder result = new StringBuilder();
        while ((intValueOfChar = reader.read()) != -1) {
            result.append((char) intValueOfChar);
        }
        String command= String.valueOf(result);
        System.out.println(result);
       if(command.equals("QRCode=GENERATION")){
           RequestDispatcher requestDispatcher= req.getRequestDispatcher("/account.jsp");
           requestDispatcher.forward(req,resp);
       }
       else {
           resp.setContentType("text/html");
           PrintWriter printWriter = resp.getWriter();

           printWriter.println("<html>\n" +
                   "<body>\n" +
                   "<p>"+result+"</p>\n" +
                   "</body>\n" +
                   "</html>");
           printWriter.close();
       }

    }
}
