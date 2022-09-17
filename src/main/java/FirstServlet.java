import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    public FirstServlet(){}
    @Override
    public void init(ServletConfig config) throws ServletException {
            super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        //resp.sendRedirect(req.getContextPath() + "/");


        String URL = req.getRequestURI();
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html>\n" +
                "<body>\n" +
                "<h2>Registration</h2>\n" +
                "<form method=\"post\" action=\"show\">\n" +
                "  <label for=\"firstName\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"firstName\" name=\"firstName\" value=\"Rifat\"><br>\n" +
                "  <label for=\"firstName\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"LastName\" name=\"firstName\" value=\"Ismailov\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> \n" +
                "<p>Hello.</p>\n" +
                "</body>\n" +
                "</html>");
        // printWriter.write("Page was visited " + visitCounter + " times.");
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
