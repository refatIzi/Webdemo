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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        BufferedReader reader = req.getReader();
        int intValueOfChar;
        StringBuilder result = new StringBuilder();
        while ((intValueOfChar = reader.read()) != -1) {
            result.append((char) intValueOfChar);
        }
        String[] people = result.toString().split("&");

        String user = people[0].replaceAll("(^[a-zA-Z]*=)", "");
        String pass = people[1].replaceAll("(^[a-zA-Z]*=)", "");
        /**Тут будет проварека данных через Базу данных mySQL с  него  бкдет считываться информация
         * будет сравниваться если естьтакой такой пользователь
         * к прмиеру будет сравнвиаться логин и парлль если есть совпадения будет перенаправлять на страницу списка акаунтов*/
        resp.sendRedirect("/account");

    }

}
