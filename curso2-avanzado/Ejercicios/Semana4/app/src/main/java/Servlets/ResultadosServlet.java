package Servlets;

import Controllers.VotoController;
import entities.Voto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet(urlPatterns = "/resultados")
public class ResultadosServlet extends HttpServlet {

    private final VotoController votoController = new VotoController();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, Long> votos = votoController.findAll().stream().collect(Collectors.groupingBy(Voto::getPartido, Collectors.counting()));

        request.setAttribute("listado",votos);
        request.getRequestDispatcher("mostrarResultados.jsp").forward(request,response);
    }
}
