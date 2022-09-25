package info;

import db.Control;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/account")
public class InfoAccount extends HttpServlet {
    String start = "<!DOCTYPE html>\n" +
            "<html lang=\"en\" >\n" +
            "<head>\n" +
            "  <meta charset=\"UTF-8\">\n" +
            "  <title>CodePen - Chat UI Responsive</title>\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
            " \n" +
            "\n" +
            "<link rel=\"stylesheet\" href=\"./css/styleChat.css\">\n" +
            "\n" +
            "</head>\n" +
            "<body>\n" +
            "<!-- partial:index.partial.html -->\n" +
            "<div class=\"--dark-theme\" id=\"chat\">\n" +
            "  <div class=\"chat__conversation-board\">";
    String end = "</div>\n" +
            "  <div class=\"chat__conversation-panel\">\n" +
            "    <div class=\"chat__conversation-panel__container\">\n" +
            "      <form method=\"post\" action=\"account\">\n" +
            "      <input class=\"chat__conversation-panel__input panel-item\" placeholder=\"Write name accaunte....\"/>   \n" +
            "      </form>\n" +
            "    </div>  \n" +
            "  </div>\n" +
            "</div>\n" +
            "<!-- partial -->\n" +
            "</body>\n" +
            "</html>";

    String info(String message) {
        return " <div class=\"chat__conversation-board__message-container\">\n" +
                "      <div class=\"chat__conversation-board__message__person\">\n" +
                "        <div class=\"chat__conversation-board__message__person__avatar\"><img src=\"https://randomuser.me/api/portraits/women/44.jpg\" alt=\"Monika Figi\"/></div><span class=\"chat__conversation-board__message__person__nickname\">Monika Figi</span>\n" +
                "      </div>\n" +
                "      <div class=\"chat__conversation-board__message__context\">\n" +
                "        <div class=\"chat__conversation-board__message__bubble\"> <span>" + message + "</span></div>\n" +
                "      </div>\n" +
                "      <div class=\"chat__conversation-board__message__options\">\n" +
                "    <button class=\"favorite styled\"\n" +
                "        type=\"button\">\n" +
                "    Show Account\n" +
                "</button>\n" +
                "      </div>\n" +
                "    </div>";

    }
    List<String> lists = new Control().getAccount();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(start);
        /**Тут выводяться список аккаунтов*/
        for (String list : lists) {
            printWriter.println(info(list + " This account was created automatically. The data is not correct"));
        }
        printWriter.println(end);
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(start);
        /**Тут будет поиск по запросу на аккаунт*/
        printWriter.println(end);
        printWriter.close();

    }
}
