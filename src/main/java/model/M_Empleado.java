/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nicolas pc
 */
public class M_Empleado {
    private int ID_emp;
    private String Nom;
    private String Ape;
    private int Seg_Social;
    private int DNI;
    private int Telf;
    private Boolean Sexo;
    private String Direcion;

    public M_Empleado(int ID_emp, String Nom, String Ape, int Seg_Social, int DNI, int Telf, Boolean Sexo, String Direcion) {
        this.ID_emp = ID_emp;
        this.Nom = Nom;
        this.Ape = Ape;
        this.Seg_Social = Seg_Social;
        this.DNI = DNI;
        this.Telf = Telf;
        this.Sexo = Sexo;
        this.Direcion = Direcion;
    }

    public int getID_emp() {
        return ID_emp;
    }

    public String getNom() {
        return Nom;
    }

    public String getApe() {
        return Ape;
    }

    public int getSeg_Social() {
        return Seg_Social;
    }

    public int getDNI() {
        return DNI;
    }

    public int getTelf() {
        return Telf;
    }

    public Boolean getSexo() {
        return Sexo;
    }

    public String getDirecion() {
        return Direcion;
    }

    public void setID_emp(int ID_emp) {
        this.ID_emp = ID_emp;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setApe(String Ape) {
        this.Ape = Ape;
    }

    public void setSeg_Social(int Seg_Social) {
        this.Seg_Social = Seg_Social;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setTelf(int Telf) {
        this.Telf = Telf;
    }

    public void setSexo(Boolean Sexo) {
        this.Sexo = Sexo;
    }

    public void setDirecion(String Direcion) {
        this.Direcion = Direcion;
    }

    public M_Empleado() {
    }
    
    
}
