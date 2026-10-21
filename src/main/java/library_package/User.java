/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package library_package;

/**
 *
 * @author daniela
 */
public class User {
    private int UserID=(int)(Math.random()*1000000);
    private String email;
    private String username;
    private String password;

    public User(String username, String email, String password){
        this.username=username;
        this.email=email;
        this.password=password;
    }

    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }
    public int getUserID(){
        return UserID;
    }
    public String getPassword(){
        return password;
    }

    public void menu(){
        
    }
}
