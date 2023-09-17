<%-- 
    Document   : Edit _prod
    Created on : 17 ago. 2023, 21:36:20
    Author     : nicolas pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./estilos.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div>TODO write content</div>
        <%/*
           int id_adm = Integer.parseInt(request.getParameter("id_adm"));
           
           int id_prod = Integer.parseInt(request.getParameter("id_prod"));
           String nom =request.getParameter("nom");
           double precio = (request.getParameter("precio") != null) ? Double.parseDouble(request.getParameter("precio")) : 0.0;
           int stock = (request.getParameter("stock") != null) ? Integer.parseInt(request.getParameter("stock")) : 0;
           String  cat     =request.getParameter("cat");
           String  des     =request.getParameter("des");*/
            String nom = (String) request.getAttribute("nom");
            Double precio = (Double) request.getAttribute("precio");
            Integer stock = (Integer) request.getAttribute("stock");
            Integer cat = (Integer) request.getAttribute("cat");
            String des = (String) request.getAttribute("des"); 
            String marca = (String) request.getAttribute("marca");
            Integer id_prod = (Integer) request.getAttribute("id_prod");
            /*Integer id_adm = (Integer) request.getAttribute("id_adm");*/

        %>
        <form action="controlador.jsp" method="get">
        <div>nombre:     <input type="text" name="nom" placeholder="<%=nom%>" value="<%=nom%>" ></div>
        
        <input type="hidden" name="id_prod"  value="<%=id_prod%>">
        <div>precio:     <input type="text" name="precio" placeholder="<%=precio%>" value="<%=precio%>"></div>
        <div>stock:      <input type="text" name="stock" placeholder="<%=stock%>" value="<%=stock%>"></div>
        <div>categoria:  <input type="text" name="cat" placeholder="<%=cat%>" value="<%=cat%>"></div>
        <div>marca:      <input type="text" name="marca" placeholder="<%=marca%>" value="<%=marca%>"></div>
        <div>descripcion:<textarea   name="des" placeholder="<%=des%>" value="<%=des%>" ><%=des%></textarea></div>
        <input type="hidden" name="tipo"  value="edit_prod_aut">
        <input type="submit" value="guardar registros">
        </form>
    </body>
</html>
