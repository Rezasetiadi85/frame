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
public class user {
    Integer idUser;
    String username;
    String password;
    String group;
    String email;
    
    public user(int paramIdUser){
        idUser = paramIdUser;     
}
    public user(int paramIdUser,String paramusername){
        idUser = paramIdUser;
        username = paramusername;
}
    public user(int paramIdUser,String paramusername,String parampassword){
        idUser = paramIdUser;
        username = paramusername;
        password = parampassword;
}
    public user(int paramIdUser,String paramusername,String parampassword,String paramgroup){
        idUser = paramIdUser;
        username = paramusername;
        password = parampassword;
        group = paramgroup;
}
    public user(int paramIdUser,String paramusername,String parampassword,String paramgroup,String paramemail){
        idUser = paramIdUser;
        username = paramusername;
        password = parampassword;
        group = paramgroup;
        email = paramemail;
}
    public void setidUser(int idUser){
            this.idUser=idUser;
    }
    
    public int getidUser(){
        return this.idUser;
    }
    
    public void setusername(String username){
            this.username=username;
    }
    
    public String getusername(){
        return this.username;
    }
    public void setpassword(String password){
            this.password=password;
    }
    
    public String getpassword(){
        return this.password;
    }
    
    public void setgroup(String group){
            this.group=group;
    }
    
    public String getgroup(){
        return this.group;
    }
    
    public void setemail(String email){
            this.email=email;
    }
    
    public String getemail(){
        return this.email;
    }
}