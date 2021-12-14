package application;

import entities.Cont;

import java.util.Scanner;

/**
 *
 */
public class Acc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number account: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder name: ");
        sc.nextLine()   ;
        String holder = sc.next();
        System.out.print("Enter with the initial deposit: ");
        double balance = sc.nextDouble();
        System.out.print("Which type is? ");
        String type = sc.next();
        Cont cont = new Cont(number, holder, balance, type);
        System.out.println(cont);
        System.out.print("Enter the deposit value: ");
        double quantity = sc.nextDouble();
        cont.deposit(quantity);
        System.out.println(cont);
        System.out.println("Enther the withDraw value: ");
        quantity = sc.nextDouble();
        cont.withDraw(quantity);
        System.out.println();
        System.out.println(cont);

        sc.close();

    }



}
