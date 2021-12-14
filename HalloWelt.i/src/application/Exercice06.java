package application;

import java.util.Scanner;

/*Make a program that reads a user name and its password and does not accept the
the same password as the user name, showing an error message and
and then prompts again for the information.*/
public class Exercice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new user: ");
        int user = sc.nextInt();
        System.out.println("Enter a new password: ");
        int pass = sc.nextInt();
        while(user == pass){
            System.out.println("The password cannot be the same as the user, try it again: ");
            pass = sc.nextInt();
        }
        System.out.println("Hello "+user+". Your password is: "+pass);

        sc.close();
    }

}
