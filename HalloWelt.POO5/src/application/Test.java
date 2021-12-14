package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String depName = sc.nextLine();
        System.out.println("ENTER WORKER DATA: ");
        System.out.print("Worker name: ");
        String wName = sc.nextLine();
        System.out.print("Worker level: ");
        String wLevel = sc.nextLine();
        System.out.print("Worker base salary: ");
        double bSalary = sc.nextDouble();
        Worker worker = new Worker(wName, WorkerLevel.valueOf(wLevel), bSalary, new Department(depName));

        System.out.print("How many contracts to this worker? ");
        int quantity = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< quantity; i++){
            System.out.println("Enter contract #" +(i+1)+"  data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYear = sc.next();
        int month = Integer.parseInt(monthYear.substring(0,2));
        int year = Integer.parseInt(monthYear.substring(3));
        System.out.println("DATA:");
        System.out.println("Worker name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+monthYear+": "+worker.income(year, month));





        sc.close();
    }
}
