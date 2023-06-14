/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Muhammadrezasetiadi_2110010424;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class tipeproperti {
    Integer idTipeproperti;
    String tipeproperti;
   
     public tipeproperti(int paramIdTipeproperti){
        idTipeproperti = paramIdTipeproperti;     
}
    public tipeproperti(int paramIdTipeproperti,String paramtipeproperti){
        idTipeproperti = paramIdTipeproperti;
        tipeproperti = paramtipeproperti;
} 
    public void setidTipeproperti(int idTipeproperti){
            this.idTipeproperti=idTipeproperti;
    }
    
    public int getidTipeproperti(){
        return this.idTipeproperti;
    }
    
    public void settipeproperti(String tipeproperti){
            this.tipeproperti=tipeproperti;
    }
    
    public String gettipeproperti(){
        return this.tipeproperti;
    }
}
