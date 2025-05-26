package Servlets;
import entities.Partido;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/verVotos")
public class votosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Partido> partidos = new ArrayList<>();

        partidos.add(new Partido("Partido1", 5));
        partidos.add(new Partido("Partido2", 3));
        partidos.add(new Partido("Partido3", 7));

        request.setAttribute("listado",partidos);
        request.getSession().setAttribute("listado", partidos);

        request.getRequestDispatcher("verVotos.jsp").forward(request,response);
    }
}
