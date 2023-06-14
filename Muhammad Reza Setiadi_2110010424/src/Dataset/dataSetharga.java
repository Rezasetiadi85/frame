/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class dataSetharga {
    private ArrayList<Integer> id_Harga;
    private ArrayList<String> Harga;
    
    public dataSetharga() {
        id_Harga = new ArrayList<Integer> ();
        Harga = new ArrayList<String> ();
    }

    public ArrayList<Integer> getId_Harga() {
        return id_Harga;
    }

    public void setId_Harga(ArrayList<Integer> id_Harga) {
        this.id_Harga = id_Harga;
    }

    public ArrayList<String> getHarga() {
        return Harga;
    }

    public void setHarga(ArrayList<String> Harga) {
        this.Harga = Harga;
    }
    
    
}
