

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

/**
 *
 * @author nicolas pc
 */
public class C_controler {
    public Boolean[] Aut_Adm(String usuario , String Contra , int id)
    {
        Boolean []Rs = new Boolean[2];
        if(usuario.equals("adm"))
        {
            if(Contra.equals("1234")){Rs[0]=true;Rs[1]=true;}
            else {Rs[0]=true;Rs[1]=false;}
        }else{Rs[0]=false;Rs[1]=false;}
        return Rs;
    }
    public void Edit_Prod(int ID, String Nom, Double Precio, int Stock, String Categoria, String Descip){}

    public C_controler() {
    }
    
}
