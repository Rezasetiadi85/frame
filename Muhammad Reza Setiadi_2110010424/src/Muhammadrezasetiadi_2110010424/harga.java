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
public class harga {
    int idharga;
    String harga;
    
     public harga(int paramIdHarga){
        idharga = paramIdHarga;     
}
    public harga(int paramIdHarga,String paramharga){
        idharga = paramIdHarga;
        harga = paramharga;
}
    public void setidHarga(int idharga){
            this.idharga=idharga;
        
    }
    
    public int getidHarga(){
        return this.idharga;
}
    
public void setharga(String harga){
        if (harga.equals("100.000")){
            JOptionPane.showMessageDialog(null, "harga belum diisi");
        }else{
            this.harga=harga;
        }
    }
    
    public String getharga(){
        return this.harga;
    }
    
}
