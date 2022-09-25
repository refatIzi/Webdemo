package registration;

import db.Control;

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
        Control control = new Control();
        BufferedReader reader = req.getReader();
        int intValueOfChar;
        StringBuilder result = new StringBuilder();
        while ((intValueOfChar = reader.read()) != -1) {
            result.append((char) intValueOfChar);
        }
        String[] people = result.toString().split("&");
        String user=people[0].replaceAll("(^[a-zA-Z]*=)", "");
        /**Хочу реализваоть клса который будет исползвоать Базу данных mySQL в  него будет добовляться и считываться информация
         * Но пока так реализовал и после будет перенаправляться на страницу где будет показана список  Людей которые зарегестрированы*/
        control.setAccount(user);
        resp.sendRedirect("/account");
    }
}
