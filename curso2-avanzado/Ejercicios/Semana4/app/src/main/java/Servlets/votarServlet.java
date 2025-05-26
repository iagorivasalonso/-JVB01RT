package Servlets;

import entities.Partido;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/")
public class votarServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      System.out.println(request.getParameter("rbtPartidos"));

        List<Partido> partidos = (List<Partido>) request.getSession().getAttribute("listado");

        for(int i = 0; i < partidos.size(); i++)
        {
            if(request.getParameter("rbtPartidos").equals(partidos.get(i).getNombre()));
            {
                System.out.println(partidos.get(i).getNombre());
                partidos.get(i).setVotos(partidos.get(i).getVotos()+1);
            }
        }

        System.out.println(partidos);

        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
