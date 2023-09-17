<%-- 
    Document   : crud
    Created on : 19 ago. 2023, 01:33:08
    Author     : nicolas pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <<head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD LOCAL JS</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./estilos.css">
        <%
            int[] ids = (int[]) request.getAttribute("ids");
            String[] noms = (String[]) request.getAttribute("noms");
            String[] mars = (String[]) request.getAttribute("mars");
        %>
    </head>
    <body>
        <h1>CRUD Local JavaScript</h1>
    </div>
    
    <div class="contenedor">

        <div class="div-formulario">
            <h2>Formulario</h2>

            <form action="#" id="formulario">
                <input type="text" id="nombre" placeholder="Ingresa un nombre">
                <input type="text" id="puesto" placeholder="Ingresa el puesto">
                <button type="submit" id="btnAgregar">Agregar</button>
            </form>
        </div>

        <div class="div-listado">
            <h2>Listado producto</h2>
            <div class="div-empleados">
                <table class="table-container">
                    <tr>
                        <td>nombre</td>
                        <td>marca</td>
                        <td>editar</td>
                    </tr>
                    <% for (int i = 0; i < ids.length; i++) { %>
                        <td><%= noms[i] %></td>
                        <td><%= mars[i] %></td>
                        <td><a href="controlador.jsp?id_adm=1&tipo=edit_prod&id_prod=<%=ids[i]%>" >editar</a></td>
                    </tr>
                    <% } %>
                    
                </table>
            </div>
        </div>

    </div>
    </body>
</html>
