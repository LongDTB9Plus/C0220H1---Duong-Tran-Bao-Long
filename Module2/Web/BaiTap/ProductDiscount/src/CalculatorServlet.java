import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns ="/product-discount")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Double inPrice = Double.parseDouble(request.getParameter("price"));
    Double discount = Double.parseDouble(request.getParameter("discount"));
    Double discountAmount = ((inPrice * discount) / 100);
    Double outPrice = inPrice - discountAmount;


        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.printf("Discount Amount: %.0f \n",discountAmount);
        writer.printf("Discount Price: %.0f \n",outPrice);
        writer.printf("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
