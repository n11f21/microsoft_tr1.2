<%-- 
    Document   : autentidicador_adm
    Created on : 17 ago. 2023, 22:08:18
    Author     : nicolas pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <<form action="controlador.jsp" method="post">
        <%
            String tipo =request.getParameter("tipo");
            if(tipo.equals("edit_prod"))
            {
            int     id_adm  =Integer.parseInt(request.getParameter("id_adm"));
            int     id_prod =Integer.parseInt(request.getParameter("id_prod"));
            String  nom     =request.getParameter("nom");
            Double  precio  = Double.parseDouble(request.getParameter("precio"));
            int     stock   =Integer.parseInt(request.getParameter("stock"));
            String  cat     =request.getParameter("cat");
            String  des     =request.getParameter("des");
            if(Integer.parseInt(request.getParameter("num"))!= null){
                int num =Integer.parseInt(request.getParameter("num"))
                %><input type="hidden" name="num" value="<%num%>"><%
                    }
            %>
        <input type="hidden" name="nom" value="<%nom%>">
        <input type="hidden" name="id_adm" value="<%id_adm%>">
        <input type="hidden" name="id_prod" value="<%id_prod%>">
        <input type="hidden" name="precio" value="<%precio%>">
        <input type="hidden" name="stock" value="<%stock%>">
        <input type="hidden" name="cat" value="<%cat%>">
        <input type="hidden" name="des" value="<%des%>">
        <input type="hidden" name="tipo" value="edit_prod_aut">
        <%
            }
        %>
        
            <div>usuario: <input type="text" name="usu" placeholder="usuario"></div>
            <div>contra : <input type="pasword" name="contra" placeholder="contraseña"></div>
            <input type="submit" value="autentificar">
        </form>
    </body>
</html>
