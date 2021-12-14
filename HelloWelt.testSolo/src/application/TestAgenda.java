package application;

import agenda.Agenda;
import agenda.Contact;

import java.util.Scanner;

public class TestAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da agenda: ");
        String nameAg = sc.nextLine();
        Agenda ag = new Agenda(nameAg);
        System.out.print("Quantos contatos serão adicionados? ");
        int quantity = sc.nextInt();
        Contact[] contacts = new Contact[quantity];
        for(int i = 0; i< contacts.length; i++){
            Contact cont = new Contact();
            System.out.println("Contact #"+(i+1)+":");
            System.out.println("Nome: ");
            String name = sc.nextLine();
            cont.setName(name);
            System.out.println("Número: ");
            String tel = sc.nextLine();
            cont.setPhone(tel);
            System.out.println("Email: ");
            String email = sc.nextLine();
            cont.setEmail(email);

            contacts[i] = cont;
        }
        ag.setContacts(contacts);


        sc.close();
    }
}
