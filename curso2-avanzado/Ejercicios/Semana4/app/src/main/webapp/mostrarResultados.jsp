<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.Map" %>

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
                             <%
                              Map<String, Long> listado = (Map<String, Long>) request.getAttribute("listado");
                              for(Map.Entry<String, Long> entry: listado.entrySet()){
                                  String key = entry.getKey();
                                  Long value = entry.getValue();
                              %>



                               <tr>
                                   <td>Partido <%=key%></td>
                                   <td><%=value%></td>
                              </tr>

                         <% } %>

                    </tBody>
           </table>
      </main>
    </body>
</html>
