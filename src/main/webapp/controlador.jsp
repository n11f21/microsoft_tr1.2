<%-- 
    Document   : controlador
    Created on : 17 ago. 2023, 18:48:51
    Author     : nicolas pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@ page import="controler.C_controler" %>
<%@ page import="model.M_Producto" %>
<%@ page import="model.M_Administrador" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            C_controler cont = new C_controler();
        %>
        
    </head>
    
    <body>
        <h1>Hello World!</h1>
        <h2>
            <%
                String tipo = request.getParameter("tipo");
                
                if(tipo.equals("edit_prod"))
                {   
                    int id_adm = Integer.parseInt(request.getParameter("id_adm"));
                    M_Producto prod1 =new M_Producto();
                    int id_prod = Integer.parseInt(request.getParameter("id_prod"));
                    prod1.Bus_Prod(id_prod);
                    String nom=prod1.getNom();
                    
                    request.setAttribute("id_prod", id_prod);
                    request.setAttribute("nom", nom);
                    request.setAttribute("precio", prod1.getPrecio());
                    request.setAttribute("stock", prod1.getStock());
                    request.setAttribute("cat", prod1.getCategoria());
                    request.setAttribute("des", prod1.getDescip());
                    request.setAttribute("marca", prod1.getMarca());
                    request.setAttribute("id_adm", id_adm);
                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("Edit_prod.jsp");
                    dispatcher.forward(request, response);
                   /* response.sendRedirect("Edit_prod.jsp?id_adm="+ id_adm+"&id_prod="+id_prod/*+"&precio="+prod1.getPrecio());*/
                }else if(tipo.equals("edit_prod_aut")) 
                {
                    /*int num=0;
                    if (request.getParameter("num") != null) {
                    num = Integer.parseInt(request.getParameter("num"));
                }*/
                    /*String usu = request.getParameter("usu");
                    String contra = request.getParameter("contra");*/
                    /*int id_adm = (request.getParameter("id_adm") != null) ? Integer.parseInt(request.getParameter("id_adm")) : 0;
                    int id_prod = (request.getParameter("id_prod") != null) ? Integer.parseInt(request.getParameter("id_prod")) : 0;
                    String nom = request.getParameter("nom");
                    double precio = (request.getParameter("precio") != null) ? Double.parseDouble(request.getParameter("precio")) : 0.0;
                    int stock = (request.getParameter("stock") != null) ? Integer.parseInt(request.getParameter("stock")) : 0;
                    int cat = (request.getParameter("cat") != null) ? Integer.parseInt(request.getParameter("cat")) : 0;
                    String des = request.getParameter("des");
                    String marca = request.getParameter("marca");*/
                    String nom = (String) request.getAttribute("nom");
                    Double precio = Double.parseDouble(request.getParameter("precio"));
                    Integer stock = (Integer) request.getAttribute("stock");
                    Integer cat = (Integer) request.getAttribute("cat");
                    String des = (String) request.getAttribute("des"); 
                    String marca = (String) request.getAttribute("marca");
                    Integer id_prod = (Integer) request.getAttribute("id_prod");
                    /*Integer id_adm = (Integer) request.getAttribute("id_adm");*/
                    int stockInt = stock != null ? stock.intValue() : 0; // Convertir Integer a int
                    int catInt = cat != null ? cat.intValue() : 0;       // Convertir Integer a int
                    int id_prodInt = id_prod != null ? id_prod.intValue() : 0; // Convertir Integer a int

                    M_Producto prod1 = new M_Producto(id_prodInt, nom, precio, stockInt, catInt, marca, des);
                    /*M_Producto prod2 = new M_Producto();
                    prod2.Bus_Prod(id_prod);*/
                    /*Boolean [] rs= cont.Aut_Adm(usu,contra,id_adm);
                    
                    if(rs[0]==true && rs[1]==true)
                    {
                        if (!prod1.getNom().equals(prod2.getNom())) {
                             // Acciones si los nombres son diferentes
                        }

                        if (prod1.getPrecio()!=prod2.getPrecio()) {
                                // Acciones si los precios son diferentes
                        }

                        if (prod1.getStock() != prod2.getStock()) {
                            
                        }

                        if (prod1.getCategoria() != prod2.getCategoria()) {
                            // Acciones si las categorías son diferentes
                        }

                        if (!prod1.getDescip().equals(prod2.getDescip())) {
                            // Acciones si las descripciones son diferentes
                        }
                        if (!prod1.getMarca().equals(prod2.getMarca())) {
                            // Acciones si las descripciones son diferentes
                        }
                    if(num<=3){
                            request.setAttribute("id_adm", id_adm);
                            request.setAttribute("id_prod", id_prod);
                            request.setAttribute("nom", prod1.getNom());
                            request.setAttribute("precio", prod1.getPrecio());
                            request.setAttribute("stock", prod1.getStock());
                            request.setAttribute("cat", prod1.getCategoria());
                            request.setAttribute("des", prod1.getDescip());
                        
                            if(rs[0]==false && rs[1]==true)
                            {
                                request.setAttribute("ms","usu");
                                num ++;
                            }
                            else if(rs[0]==true && rs[1]==false)
                            {
                                request.setAttribute("ms","contra");
                                num ++;
                            }
                            else if(rs[0]==false && rs[1]==false)
                            {
                                request.setAttribute("ms","nin");
                                num ++;
                            }
                        }else{
                            request.setAttribute("ms","ex");
                            //expulcion
                        }*/
                    
                     try {
                        prod1.editar(id_prodInt, nom, precio, stockInt, catInt, marca, des);
                        /*request.setAttribute("id_adm", id_adm);*/
                        RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
                        dispatcher.forward(request, response);
                    } catch (Exception e) {
                        // Manejar la excepción aquí (por ejemplo, mostrar un mensaje de error)
                        e.printStackTrace(); // Imprime la excepción en la consola (para depuración)
                    }
                    
                    
                        
                    
                }else if(tipo.equals("edit_prod_aut_ant")){
                    int num=0;
                    if (request.getParameter("num") != null) {
                    num = Integer.parseInt(request.getParameter("num"));}
                    
                }else if(tipo.equals("list"))
                {
                    int id_adm = Integer.parseInt(request.getParameter("id_adm"));
                    M_Producto[] list = new M_Producto[10];
                    
                    int[] id=new int[10];
                    String[] nom = new String[10];
                    String[] mar = new String[10];
                    for (int i = 0; i < 10; i++) {  
                        int a =i+1;
                        list[i] = new M_Producto();
                        list[i].Bus_Prod(a);
                        id[i] = list[i].getID();
                        nom[i] = list[i].getNom();
                        mar[i] = list[i].getMarca();
                    }
                    request.setAttribute("ids", id);
                    request.setAttribute("noms", nom);
                    request.setAttribute("mars", mar);   
                    request.getRequestDispatcher("crud.jsp").forward(request, response);
                }
            %>
        </h2>
    </body>
</html>
