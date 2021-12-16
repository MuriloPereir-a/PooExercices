package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<TaxPayer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #"+(i+1)+ "data: ");
            System.out.print("Individual or company (i/c)? ");
            char rep = sc.next().charAt(0);
            sc.nextLine();
            if(rep == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIn = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healExp = sc.nextDouble();

                list.add(new Individual(name, anualIn, healExp));
            }else if(rep == 'c'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIn = sc.nextDouble();
                System.out.print("Number of employees: ");
                int emp = sc.nextInt();

                list.add(new Company(name, anualIn, emp));
            }
        }
        System.out.println("------------");
        System.out.println("TAXES PAID:");
        for(TaxPayer x : list){
            System.out.println(x.getName()+": $"+String.format("%.2f",x.tax()));
        }
        System.out.println();
        double sum = 0;
        for(TaxPayer y : list){
            sum += y.tax();
        }
        System.out.printf("Total taxes: $%.2f", sum);


        sc.close();
    }
}
