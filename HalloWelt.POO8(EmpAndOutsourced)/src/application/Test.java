package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {

            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char rep = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double vph = sc.nextDouble();
            if (rep == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();

                employees.add(new OutSourcedEmployee(name, hours, vph, additional));

            }else if(rep == 'n'){
                employees.add(new Employee(name, hours, vph));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee x : employees){
            System.out.print(x.getName() +" - $"+ x.payment()+"\n");
        }


        sc.close();
    }
}
