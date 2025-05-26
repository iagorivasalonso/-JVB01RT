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
        <form action="/app/Votar" method="get">
            <input type="radio" id="rbtPartido" name ="rbtPartidos" value="Partido1" />
            <label for="html">Partido A</label><br/>
            <input type="radio" id="rbtPartido" name ="rbtPartidos" value="Partido2" />
            <label for="html">Partido B</label><br/>
            <input type="radio" id="rbtPartido" name ="rbtPartidos" value="Partido3" />
            <label for="html">Partido C</label><br/><br/>

            <button class = "mi-boton-votar" >Votar</button><br/><br/>
         </form>
       <form action="/app/verVotos" method="get">
            <button type="submit" name="accion" class = "mi-boton-mostrar">Mostrar Resultados</button>
          </form>
    </body>
</html>
