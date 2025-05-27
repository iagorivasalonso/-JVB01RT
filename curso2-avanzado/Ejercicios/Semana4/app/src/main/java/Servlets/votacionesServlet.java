package Servlets;
import Controllers.VotoController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/votaciones")
public class votacionesServlet extends HttpServlet {
    private final VotoController votoController = new VotoController();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("votaciones.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String partidoVotado = request.getParameter("partido");

        // Lo guardo en el DB
        votoController.create(partidoVotado);

        System.out.println("---" + partidoVotado );
        request.getRequestDispatcher("votaciones.jsp").forward(request, response);


    }
}
