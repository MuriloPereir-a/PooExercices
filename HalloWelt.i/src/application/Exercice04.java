package application;

import java.util.Scanner;

public class Exercice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        System.out.println("Enter 1 for Alcohol, 2 for Gasoline, 3 for Diesel, 4 or 0 to exit.");
        int fuel = sc.nextInt();
        while(fuel > 0 && fuel < 4){
            if(fuel == 1){
                alcohol++;
            }else if(fuel == 2){
                gasoline++;
            }else if(fuel == 3){
                diesel++;
            }
            fuel = sc.nextInt();
        }
        System.out.println("Alcohol: "+alcohol);
        System.out.println("Gasoline: "+gasoline);
        System.out.println("Diesel: "+diesel);
        System.out.println("Thank you!");
        sc.close();
    }

}
