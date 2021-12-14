package application;

import programm.Agenda;
import programm.Contact;

import java.awt.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the schedule name: ");
        String name = sc.nextLine();
        Agenda ag = new Agenda(name);
        System.out.print("How many contacts will be added? ");
        int quantity = sc.nextInt();
        sc.nextLine();
        Contact[] contacts = new Contact[quantity];

        for(int i = 0; i< contacts.length; i++){
            System.out.println("Contact #"+ (i+1)+": ");
            Contact contact = new Contact();
            System.out.print("Name: ");
            String nameC = sc.nextLine();
            contact.setName(nameC);
            System.out.print("Phone number: ");
            String phone = sc.nextLine();
            contact.setTelNumber(phone);
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            contact.setEmail(email);

            contacts[i] = contact; //
        }
        ag.setContacts(contacts);
        if(ag != null){
            System.out.println("Contacts: ");
            System.out.println(ag.obterInfo());
        }

        sc.close();
    }

}
