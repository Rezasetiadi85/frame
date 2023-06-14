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
public class dataSetReservasi {
    private ArrayList<Integer> idReservasi;
    private ArrayList<Integer> idProperti;
    private ArrayList<String> nama;
    private ArrayList<String> notlp;
    private ArrayList<String> alamat;
    private ArrayList<String> daritgl;
    private ArrayList<String> sampaitgl;
    private ArrayList<String> status;
    
    public dataSetReservasi() {
        idReservasi = new ArrayList<Integer> ();
        idProperti = new ArrayList<Integer> ();
        nama = new ArrayList<String> ();
        notlp = new ArrayList<String> ();
        alamat = new ArrayList<String> (); 
        daritgl = new ArrayList<String> ();
        sampaitgl = new ArrayList<String> ();
        status = new ArrayList<String> (); 
    }

    public ArrayList<Integer> getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(ArrayList<Integer> idReservasi) {
        this.idReservasi = idReservasi;
    }

    public ArrayList<Integer> getIdProperti() {
        return idProperti;
    }

    public void setIdProperti(ArrayList<Integer> idProperti) {
        this.idProperti = idProperti;
    }

    public ArrayList<String> getNama() {
        return nama;
    }

    public void setNama(ArrayList<String> nama) {
        this.nama = nama;
    }

    public ArrayList<String> getNotlp() {
        return notlp;
    }

    public void setNotlp(ArrayList<String> notlp) {
        this.notlp = notlp;
    }

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public void setAlamat(ArrayList<String> alamat) {
        this.alamat = alamat;
    }

    public ArrayList<String> getDaritgl() {
        return daritgl;
    }

    public void setDaritgl(ArrayList<String> daritgl) {
        this.daritgl = daritgl;
    }

    public ArrayList<String> getSampaitgl() {
        return sampaitgl;
    }

    public void setSampaitgl(ArrayList<String> sampaitgl) {
        this.sampaitgl = sampaitgl;
    }

    public ArrayList<String> getStatus() {
        return status;
    }

    public void setStatus(ArrayList<String> status) {
        this.status = status;
    }
    
}
