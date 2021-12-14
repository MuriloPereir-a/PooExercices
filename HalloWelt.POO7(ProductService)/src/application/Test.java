package application;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("--------------------------");
        System.out.println("Enter client data:");
        System.out.print("Client name: ");
        String nameC = sc.nextLine();
        System.out.print("Enter client e-mail: ");
        String emailC = sc.nextLine();
        System.out.print("Enter client birth date: ");
        Date birth = sdf.parse(sc.next());

        Client client = new Client(nameC, emailC, birth);

        System.out.println("Enter order data: ");
        System.out.println("STATUS: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Enter #"+(i+1)+" item data:");
            System.out.print("Product name: ");
            String nameProd = sc.nextLine();
            System.out.print("Product price: ");
            double priceProd = sc.nextDouble();
            System.out.print("Product quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(nameProd, priceProd);
            OrderItem orderItem = new OrderItem(quantity, priceProd, product);

            order.addItem(orderItem);

        }
        System.out.println(order);
        sc.close();
    }
}
