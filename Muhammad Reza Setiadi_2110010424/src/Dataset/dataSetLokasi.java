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
public class dataSetLokasi {
    private ArrayList<Integer> id_Lokasi;
    private ArrayList<String> Lokasi;
    
    public dataSetLokasi() {
        id_Lokasi = new ArrayList<Integer> ();
        Lokasi = new ArrayList<String> ();
    }

    public ArrayList<Integer> getId_Lokasi() {
        return id_Lokasi;
    }

    public void addIdlokasi(Integer value){
        this.id_Lokasi.add(value);
    }

    public ArrayList<String> getLokasi() {
        return Lokasi;
    }

    public void setLokasi(ArrayList<String> Lokasi) {
        this.Lokasi = Lokasi;
    }
    
    
}
