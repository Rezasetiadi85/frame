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
public class dataSetKamartidur {
    private ArrayList<Integer> id_Kamartidur;
    private ArrayList<String> Kamartidur;
    
    public dataSetKamartidur() {
        id_Kamartidur = new ArrayList<Integer> ();
        Kamartidur = new ArrayList<String> ();
    }

    public ArrayList<Integer> getId_Kamartidur() {
        return id_Kamartidur;
    }

    public void setId_Kamartidur(ArrayList<Integer> id_Kamartidur) {
        this.id_Kamartidur = id_Kamartidur;
    }

    public ArrayList<String> getKamartidur() {
        return Kamartidur;
    }

    public void setKamartidur(ArrayList<String> Kamartidur) {
        this.Kamartidur = Kamartidur;
    }
    
}
