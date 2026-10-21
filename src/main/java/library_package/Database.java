/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package library_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author daniela
 */
public class Database {
    private List<User> UserList=new ArrayList<>();

    public void addNewUser(User newUser){
        UserList.add(newUser);
        System.out.println("You have been enrolled successfully ");
    }

    public boolean searchUser(String username, String password){
        for (User u: UserList){
            if((u.getUsername()).equals(username) && (u.getPassword()).equals(password)){
                System.out.println("Hello "+ username);
                return true;
            }
        }
        System.out.println("Something went wrong. You weren't found in our database");
        return false;
    }

    public boolean login() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("----------LOGIN----------");
        System.out.println("Enter your username: ");
        String usernameLog=scanner.next();
        System.out.println("Enter your password: ");
        String passwordLog=scanner.next();
        if(searchUser(usernameLog, passwordLog)){
            System.out.println("Welcome " + usernameLog);
            return true;
        }
        System.out.println("Something went wrong. Try again. Please create a new account if you are new to our system");
        scanner.close();
        return false;
    }

    public User createNewUser() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("We're adding you to our Database: ");
        System.out.println("Enter username: ");
        String username=scanner.next();
        System.out.println("Enter email: ");
        String email=scanner.next();
        System.out.println("Enter password: ");
        String password=scanner.next();
        System.out.println("Are you a new admin? (enter 'A' for yes)");
        User newUser;
        if((scanner.next())=="A"){
            newUser=new Admin(username, email, password);
        }else{
            newUser=new NormalUser(username, email, password);
        }
        
        scanner.close();
        System.out.println("Your account has been created successfully");
        return newUser;
    }

    public Database(){}
}
