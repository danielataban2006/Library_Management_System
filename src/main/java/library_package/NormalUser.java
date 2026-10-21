package library_package;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String username, String email, String password){
        super (username, email, password);
    }

    @Override
    public void menu(){
        System.out.println("1. view Books       2. search Book       3. my Account       4. Exit");
        Scanner s = new Scanner(System.in);
        
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
            default:
                System.out.println("Please enter a valid Number");
        }


    }
}
