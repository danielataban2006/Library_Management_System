/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

https://www.youtube.com/watch?v=A5zLwnUJtVc&list=PL-cxzMmn1xXG87ak7josmprqsp3da_Ovk
Bibliotheksverwaltungssystem | Anmeldeseite erstellen | Teil -1 von findproject - als nächstes 
 */

package library_package;

import java.util.Scanner;

/**
 *
 * @author daniela
 */
public class Library {

    public static void main(String[] args) {
        Database databaseUser=new Database();
        Scanner scanner=new Scanner(System.in);


        boolean startpage=true;
        while (startpage){
            System.out.println("Welcome to our TU Library Management System");
            System.out.println("1.Login          2.New User          3.Exit");
            int logOrnew=scanner.nextInt();
            switch(logOrnew){
                case 1:
                    startpage=!(databaseUser.login());
                    break;
                case 2: 
                    User newUser=databaseUser.createNewUser();
                    databaseUser.addNewUser(newUser);
                    break; 
                case 3: 
                    break;
                default:
                    System.out.println("Error");    
            }

        }
        scanner.close();
    }
}
