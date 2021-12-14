package application;

import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year; //year
        double popA, popB, tA,tB; //country A's population and country B's population and their respective growth rates
        System.out.println("Enter the population of the first country: ");
        popA = sc.nextDouble();
        System.out.println("Enter the population of the second country: ");
        popB = sc.nextDouble();
        System.out.println("Enter with first growth rate ");
        tA = sc.nextDouble();
        System.out.println("Enter with second growth rate ");
        tB = sc.nextDouble();
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        int cont = 0;
        do{
            popA += (popA/100) * tA;
            popB += (popB/100) * tB;
            year++;
            cont++;
        }while(popA < popB);
        System.out.println("The population of the first country will be equal to or greater than that of the second in: "+year+" (years: "+cont+")");
        sc.close();
    }
}
