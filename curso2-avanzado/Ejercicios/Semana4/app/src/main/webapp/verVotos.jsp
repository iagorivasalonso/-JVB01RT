<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.List, entities.Partido" %>

<!DOCTYPE html>

<html lang="en">
    <head>
    </head>
    <body>
      <main class="contenido-principal">
           <h1>Resultados votaciones</h1>

           <table class="contenido" border="1">
                     <thead>
                           <tr>
                              <th>Nombre Partido</th>
                              <th> Cantidad votos</th>
                           </tr>
                     </thead>

                     <tBody>
                         <% List<Partido> partidos = (List<Partido>) request.getAttribute("listado");
                           for(Partido partido: partidos) { %>
                               <tr>
                                   <td><%= partido.getNombre()%></td>
                                   <td><%= partido.getVotos()%></td>
                              </tr>
                         <% } %>
                    </tBody>
           </table>
      </main>
    </body>
</html>
