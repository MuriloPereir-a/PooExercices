package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Product> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            System.out.println("Product #"+(i+1)+" data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char rep = sc.next().charAt(0);
            sc.nextLine();
            if(rep == 'c'){
                System.out.print("Name: ");
                String nameP = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(nameP, price));
            }
            if(rep == 'u'){
                System.out.print("Name: ");
                String nameP = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(nameP, price, date));
            }else if(rep == 'i'){
                System.out.print("Name: ");
                String nameP = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double cusFee = sc.nextDouble();
                list.add(new ImportedProduct(nameP, price, cusFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product x : list){
        System.out.println(x.pay());
        }

        sc.close();
    }
}
