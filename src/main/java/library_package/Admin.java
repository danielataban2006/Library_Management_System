package library_package;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String username, String email, String password){
        super (username, email, password);
    }

    @Override
    public void menu(){
        System.out.println("1. Add Book      2. Remove Book      3. search Account   ");
        System.out.println("4. search Book   5. Exit");

        Scanner s=new Scanner(System.in);
        int instruction=s.nextInt();
        switch (instruction) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4: 

                break;
            case 5:

                break;
            default:
                System.out.println("Please enter a valid Number");
                menu(); 
        }
    }
}
