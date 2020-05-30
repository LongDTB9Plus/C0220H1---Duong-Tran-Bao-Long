import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet", urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            double usd = Double.parseDouble(request.getParameter("usd"));
            double rate = Double.parseDouble(request.getParameter("rate"));
            double vnd = usd * rate;
            PrintWriter writer = response.getWriter();
            writer.print("<html>");
            writer.println("<h1>Rate: " + rate+ "</h1>");
            writer.println("<h1>USD: " + usd+ "</h1>");
            writer.printf("<h1>VND:   %.0f\n" + "</h1>",vnd);
            writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
