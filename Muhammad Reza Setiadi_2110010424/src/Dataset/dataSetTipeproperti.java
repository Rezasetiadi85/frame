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
public class dataSetTipeproperti {
    private ArrayList<Integer> idTipeproperti;
    private ArrayList<String> Tipeproperti;
    
    public dataSetTipeproperti() {
        idTipeproperti = new ArrayList<Integer> ();
        Tipeproperti = new ArrayList<String> ();
    }

    public ArrayList<Integer> getIdTipeproperti() {
        return idTipeproperti;
    }

    public void setIdTipeproperti(ArrayList<Integer> idTipeproperti) {
        this.idTipeproperti = idTipeproperti;
    }

    public ArrayList<String> getTipeproperti() {
        return Tipeproperti;
    }

    public void setTipeproperti(ArrayList<String> Tipeproperti) {
        this.Tipeproperti = Tipeproperti;
    }
    
}
