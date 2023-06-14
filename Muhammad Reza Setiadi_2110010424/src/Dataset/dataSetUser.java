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
public class dataSetUser {
    private ArrayList<Integer> idUser;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> group;
    private ArrayList<String> email;
    
    public dataSetUser() {
        idUser = new ArrayList<Integer> ();
        username = new ArrayList<String> ();
        password = new ArrayList<String> ();
        group = new ArrayList<String> ();
        email = new ArrayList<String> (); 
    }

    public ArrayList<Integer> getIdUser() {
        return idUser;
    }

    public void setIdUser(ArrayList<Integer> idUser) {
        this.idUser = idUser;
    }

    public ArrayList<String> getUsername() {
        return username;
    }

    public void setUsername(ArrayList<String> username) {
        this.username = username;
    }

    public ArrayList<String> getPassword() {
        return password;
    }

    public void setPassword(ArrayList<String> password) {
        this.password = password;
    }

    public ArrayList<String> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<String> group) {
        this.group = group;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }
    
    
}
