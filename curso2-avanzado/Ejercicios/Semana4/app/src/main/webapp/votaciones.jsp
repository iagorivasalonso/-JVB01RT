<html>
    <head>
          <style>
                  .mi-boton-votar {
                           Padding: 10px;
                           color: white;
                           background-color: blue;
                           border: none;
                       }
                 .mi-boton-mostrar {
                          Padding: 10px;
                          color: white;
                          background-color: green;
                         border: none;
                    }
          </style>
    </head>
    <body>
    <h2>Votacion</h2>
    <p>Elija su voto</p>
        <form action="/app/votaciones" method="POST">
            <input type="radio" name="partido" id ="A" value="Partido A" />
            <label for="html">Partido A</label><br/>
            <input type="radio" name="partido" id ="B" value="Partido B" />
            <label for="html">Partido B</label><br/>
            <input type="radio" name="partido" id ="C" value="Partido C" />
            <label for="html">Partido C</label><br/><br/>

            <button class = "mi-boton-votar" >Votar</button><br/><br/>
         </form>
       <form action="/app/resultados" method="GET">
            <button type="submit" name="accion" class = "mi-boton-mostrar">Mostrar Resultados</button>
          </form>
    </body>
</html>
