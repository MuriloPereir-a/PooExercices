package application;

import java.util.Scanner;

public class exercice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grade from 0 to 10: ");
        int grade = sc.nextInt();
        while(grade <0 || grade >10){
            System.out.println("Invalid grade, enter valid grade: ");
            grade = sc.nextInt();
        }
        System.out.println("The grade "+grade+" was registered!");
        sc.close();
    }


}
