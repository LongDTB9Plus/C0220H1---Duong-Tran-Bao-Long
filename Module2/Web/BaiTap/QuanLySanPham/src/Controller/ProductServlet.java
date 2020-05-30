package Controller;

import Models.Product;
import Services.Services;
import Services.impl.ServicesImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/menu")
public class ProductServlet extends HttpServlet {

    Services services = new ServicesImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionPost = request.getParameter("submit");

        switch (actionPost) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "show":
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionGet = request.getParameter("action");

        switch (actionGet) {
            case "Create":
                response.sendRedirect("create.jsp");
                break;
            case "Edit":
                showAllProduct(request, response, "edit.jsp");
                break;
            case "Delete":
                showAllProduct(request, response, "delete.jsp");
                break;
            case "Show":
                showAllProduct(request, response, "show.jsp");
                break;

        }
    }

    private void showAllProduct(HttpServletRequest request, HttpServletResponse response, String url) throws ServletException, IOException {
        request.setAttribute("listProduct", services.findAll());
        request.getRequestDispatcher(url).forward(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer price = Integer.parseInt(request.getParameter("price"));

        Product product = new Product(id, name, price);
        services.save(product);
        String message = "Create New Product Successfully!";
        request.setAttribute("message", message);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
