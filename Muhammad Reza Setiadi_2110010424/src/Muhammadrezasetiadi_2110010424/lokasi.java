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
public class lokasi {
    int idLokasi;
    String lokasi;
    
     public lokasi(int paramIdLokasi){
        idLokasi = paramIdLokasi;     
}
    public lokasi(int paramIdLokasi,String paramlokasi){
        idLokasi = paramIdLokasi;
        lokasi = paramlokasi;
}  
    public void setidLokasi(int idLokasi){
            this.idLokasi=idLokasi;
    }
    
    public int getidLokasi(){
        return this.idLokasi;
    }
    
    public void setlokasi(String lokai){
            this.lokasi=lokasi;
    }
    
    public String getlokasi(){
        return this.lokasi;
    }
}
