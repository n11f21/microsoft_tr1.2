/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.M_conection;
/**
 *
 * @author nicolas pc
 */
public class M_Producto {
    private int ID_prod;
    private String Nom;
    private Double Precio;
    private int Stock;
    private int Categoria;
    private String marca;
    private String Descip;

    public M_Producto(int ID, String Nom, Double Precio, int Stock, int Categoria , String marca, String Descip) {
        this.ID_prod = ID;
        this.Nom = Nom;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Categoria = Categoria;
        this.Descip = Descip;
        this.marca =marca;
    }

    public int getID() {
        return ID_prod;
    }

    public String getNom() {
        return Nom;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public int getCategoria() {
        return Categoria;
    }

    public String getDescip() {
        return Descip;
    }

    public void setID(int ID) {
        this.ID_prod = ID;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public void setDescip(String Descip) {
        this.Descip = Descip;
    }

    

    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public M_Producto() {
    }
    
    public void  Bus_Prod(int id){
        Connection conexion = (Connection) M_conection.abrirConexion();
        

        try {
            String consulta = "SELECT Id_prod, Id_cat, nom, marca, stock, precio, des FROM producto  WHERE Id_prod = "+id;
            PreparedStatement statement = (PreparedStatement) conexion.prepareStatement(consulta);
            

            ResultSet resultado = statement.executeQuery();

            if (resultado.next()) {
                int cat = resultado.getInt("Id_cat");
                String nom = resultado.getString("nom");
                String marc = resultado.getString("marca");
                int stock = resultado.getInt("stock");
                double precio = resultado.getDouble("precio");
                String des = resultado.getString("des");
                setID(id);
                setNom(nom);
                setPrecio(precio);
                setStock(stock);
                setCategoria(cat);
                setDescip(des);
                setMarca(marc);
                
            }

        } catch (SQLException e) {
            System.out.println("no se conecto correctamente");
        } finally {
            M_conection.cerrarConexion(conexion);
        }

    
    };

    
    
    public void editar(int ID, String Nom, Double Precio, int Stock, int Categoria , String marca, String Descip)
    {
        Connection conexion = M_conection.abrirConexion();

        try {
            String consulta = "UPDATE producto " +
                          "SET Id_cat = ?, nom = ?, marca = ?, stock = ?, precio = ?, des = ? " +
                          "WHERE Id_prod = ?";
        
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, Categoria);
            statement.setString(2, Nom);
            statement.setString(3, marca);
            statement.setInt(4, Stock);
            statement.setDouble(5, Precio);
            statement.setString(6, Descip);
            statement.setInt(7, ID);

            int filasActualizadas = statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            M_conection.cerrarConexion(conexion);
        }
    }
    
}
