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
public class dataSetProperti {
    private ArrayList<Integer> id_Properti;
    private ArrayList<String> Properti;
    private ArrayList<String> alamat;
    private ArrayList<String> area;
    private ArrayList<String> dapur;
    private ArrayList<String> deskripsi;
    private ArrayList<String> harga;
    private ArrayList<String> kamartidur;
    private ArrayList<String> lokasi;
    private ArrayList<String> photo1;
    private ArrayList<String> photo2;
    private ArrayList<String> photo3;

    
    public dataSetProperti() {
        id_Properti = new ArrayList<Integer> ();
        Properti = new ArrayList<String> ();
        alamat = new ArrayList<String> ();
        area = new ArrayList<String> ();
        dapur = new ArrayList<String> ();
        deskripsi = new ArrayList<String> ();
        harga = new ArrayList<String> ();
        kamartidur = new ArrayList<String> ();
        lokasi = new ArrayList<String> ();
        photo1 = new ArrayList<String> ();
        photo2 = new ArrayList<String> ();
        photo3 = new ArrayList<String> ();
    }

    public ArrayList<Integer> getId_Properti() {
        return id_Properti;
    }

    public void setId_Properti(ArrayList<Integer> id_Properti) {
        this.id_Properti = id_Properti;
    }

    public ArrayList<String> getProperti() {
        return Properti;
    }

    public void setProperti(ArrayList<String> Properti) {
        this.Properti = Properti;
    }

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public void setAlamat(ArrayList<String> alamat) {
        this.alamat = alamat;
    }

    public ArrayList<String> getArea() {
        return area;
    }

    public void setArea(ArrayList<String> area) {
        this.area = area;
    }

    public ArrayList<String> getDapur() {
        return dapur;
    }

    public void setDapur(ArrayList<String> dapur) {
        this.dapur = dapur;
    }

    public ArrayList<String> getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(ArrayList<String> deskripsi) {
        this.deskripsi = deskripsi;
    }

    public ArrayList<String> getHarga() {
        return harga;
    }

    public void setHarga(ArrayList<String> harga) {
        this.harga = harga;
    }

    public ArrayList<String> getKamartidur() {
        return kamartidur;
    }

    public void setKamartidur(ArrayList<String> kamartidur) {
        this.kamartidur = kamartidur;
    }

    public ArrayList<String> getLokasi() {
        return lokasi;
    }

    public void setLokasi(ArrayList<String> lokasi) {
        this.lokasi = lokasi;
    }

    public ArrayList<String> getPhoto1() {
        return photo1;
    }

    public void setPhoto1(ArrayList<String> photo1) {
        this.photo1 = photo1;
    }

    public ArrayList<String> getPhoto2() {
        return photo2;
    }

    public void setPhoto2(ArrayList<String> photo2) {
        this.photo2 = photo2;
    }

    public ArrayList<String> getPhoto3() {
        return photo3;
    }

    public void setPhoto3(ArrayList<String> photo3) {
        this.photo3 = photo3;
    }
    
    
}
