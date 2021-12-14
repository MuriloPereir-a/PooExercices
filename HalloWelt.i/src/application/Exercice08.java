package application;

import java.util.Scanner;

public class Exercice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int num = sc.nextInt();
        System.out.println("Enter limit value: ");
        int limit = sc.nextInt();

        for(int i = num; i <= limit ; i++){
            if(i % num == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
