/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nicolas pc
 */
public class M_Administrador extends M_Empleado {
    private String Usuario;
    private String Contra;

    public M_Administrador(String Usuario, String Contra, int ID_emp, String Nom, String Ape, int Seg_Social, int DNI, int Telf, Boolean Sexo, String Direcion) {
        super(ID_emp, Nom, Ape, Seg_Social, DNI, Telf, Sexo, Direcion);
        this.Usuario = Usuario;
        this.Contra = Contra;
    }



    public String getUsuario() {
        return Usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public M_Administrador() {}
    
    
    
    
}
