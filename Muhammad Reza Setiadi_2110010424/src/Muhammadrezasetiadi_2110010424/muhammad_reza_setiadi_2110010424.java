/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Muhammadrezasetiadi_2110010424;

import forms.formUtama;

/**
 *
 * @author user
 */
public class muhammad_reza_setiadi_2110010424 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       area area1 = new area(1,"Ballroom");
       harga harga1 = new harga(1, "10000");
       kamartidur kamartidur1 = new kamartidur(1, "Gajah Duduk");
       lokasi lokasi1 = new lokasi(1, "Jatim");
       properti properti1 = new properti(1, "Properti", "kalsel", "Banjarmasin", "vipp", "selamat memasuki jawa parawisata", "5000", "KM1", "madura", "p1", "p2", "p3");
       reservasi reservasi1 = new reservasi(1, 29, "Reza", "0895366684764", "jatim", "19", "29", "ada");
       tipeproperti tipeproperti1 = new tipeproperti(23, "villa");
       user user1 = new user(10, "reza", "234", "RAJAWALI GROUP", "rezasetiadi643@gmail.com");
       
       new formUtama().setVisible(true);
    } 
    

}