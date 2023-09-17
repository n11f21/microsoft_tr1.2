/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nicolas pc
 */
public class M_ProductoTest {
    
    public M_ProductoTest() {
    }

    /*@Test
    public void testGetID() {
        System.out.println("getID");
        M_Producto instance = new M_Producto();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNom() {
        System.out.println("getNom");
        M_Producto instance = new M_Producto();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        M_Producto instance = new M_Producto();
        Double expResult = null;
        Double result = instance.getPrecio();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStock() {
        System.out.println("getStock");
        M_Producto instance = new M_Producto();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        M_Producto instance = new M_Producto();
        int expResult = 0;
        int result = instance.getCategoria();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescip() {
        System.out.println("getDescip");
        M_Producto instance = new M_Producto();
        String expResult = "";
        String result = instance.getDescip();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        M_Producto instance = new M_Producto();
        instance.setID(ID);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNom() {
        System.out.println("setNom");
    String nom = "Nombre de Producto"; // Cambiar a un nombre adecuado
    M_Producto instance = new M_Producto();
    instance.setNom(nom);
    System.out.println(instance.getNom());
    System.out.println(nom);
    assertEquals(nom, instance.getNom());
    }

    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        Double Precio = null;
        M_Producto instance = new M_Producto();
        instance.setPrecio(Precio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int Stock = 0;
        M_Producto instance = new M_Producto();
        instance.setStock(Stock);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        int Categoria = 0;
        M_Producto instance = new M_Producto();
        instance.setCategoria(Categoria);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescip() {
        System.out.println("setDescip");
        String Descip = "";
        M_Producto instance = new M_Producto();
        instance.setDescip(Descip);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        M_Producto instance = new M_Producto();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        M_Producto instance = new M_Producto();
        instance.setMarca(marca);
        fail("The test case is a prototype.");
    }
*/
    @Test
    public void testBus_Prod() {
        System.out.println("testBus_Prod");
        //(11,4,'Plataforma de Salto', 'JumpPlatform', 12, 150.00, 'Plataforma de salto para ejercicios pliométricos.')
        int id = 11;
        String expectedNom = "Plataforma de Salto";
        double expectedPrecio = 150.00;
        int expectedStock = 12;
        int expectedCategoria = 4;
        String expectedMarca = "JumpPlatform";
        String expectedDescip = "Plataforma de salto para ejercicios pliométricos.";
        M_Producto instance = new M_Producto();
        instance.Bus_Prod(id);

        // Verificar que los atributos de la instancia tengan los valores esperados
        assertEquals(expectedNom, instance.getNom());
        assertEquals(expectedPrecio, instance.getPrecio(), 0.001); 
        assertEquals(expectedStock, instance.getStock());
        assertEquals(expectedCategoria, instance.getCategoria());
        assertEquals(expectedMarca, instance.getMarca());
        assertEquals(expectedDescip, instance.getDescip());
    }

    @Test
    public void testEditar() {
        //(12,3,'Cuerda de Saltar', 'JumpRope', 40, 10.00, 'Cuerda de saltar para entrenamiento cardiovascular.'),
        System.out.println("editar");
        int ID = 12;
        String Nom = "Cuerda de Saltar";
        Double Precio = 10.00;
        int Stock = 40;
        int Categoria = 3;
        String marca = "JumpRope";
        String Descip = "Cuerda de saltar para entrenamiento cardiovascular.";
        M_Producto instance = new M_Producto(ID, Nom, Precio, Stock, Categoria, marca, Descip);
        instance.editar(ID, Nom, Precio, Stock, Categoria, marca, Descip);
        instance.Bus_Prod(12);
        assertEquals(3, instance.getCategoria());
    }
    /*
    @Test
    public void testSetNomAndGetNom() {
        System.out.println("testSetNomAndGetNom");
        String nom = "Nombre de Producto"; // Cambiar a un nombre adecuado
        M_Producto instance = new M_Producto();
        instance.setNom(nom);
        assertEquals(nom, instance.getNom());
    }
    @Test
    public void testSetCategoriaAndGetCategoria() {
        System.out.println("testSetCategoriaAndGetCategoria");
        int categoria = 1; // Cambiar a una categoría válida
        M_Producto instance = new M_Producto();
        instance.setCategoria(categoria);
        assertEquals(categoria, instance.getCategoria());
    }*/
}
