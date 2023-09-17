/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nicolas pc
 */
public class M_conectionTest {
    
    public M_conectionTest() {
    }

    @Test
    public void testAbrirConexion() {
        System.out.println("abrirConexion");
        Connection result = M_conection.abrirConexion();
        assertNotNull(result);
    }

    @Test
    public void testCerrarConexion() throws SQLException {
        System.out.println("testCerrarConexion");
        Connection connection = M_conection.abrirConexion();
        M_conection.cerrarConexion(connection);
        assertFalse(connection.isValid(1)); 
        
    }
    
}
