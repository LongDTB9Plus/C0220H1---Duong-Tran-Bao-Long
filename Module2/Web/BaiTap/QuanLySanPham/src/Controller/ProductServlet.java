package Controller;

import Models.Product;
import Services.Services;
import Services.impl.ServicesImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/menu")
public class ProductServlet extends HttpServlet {

    Services services = new ServicesImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("submit");

        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
        }
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

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        services.remove(id);
        String message = "Delete Product Successfully!";
        request.setAttribute("message", message);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        services.update(id, new Product(id, name, price));
        String message = "Edit Product Successfully!";
        request.setAttribute("message", message);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action) {
            case "create":
                response.sendRedirect("create.jsp");
                break;
            case "edit":
                editProductForm(request, response);
                break;
            case "delete":
                deleteProductForm(request, response);
                break;
            case "show":
                showAllProduct(request, response);
                break;

        }
    }

    private void showAllProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listProduct", this.services.findAll());
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    private void deleteProductForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("product", services.findByID(id));
        request.getRequestDispatcher("delete.jsp").forward(request, response);
    }

    private void editProductForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("product", services.findByID(id));
        request.getRequestDispatcher("edit.jsp").forward(request, response);
    }

}
