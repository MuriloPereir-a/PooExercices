package application;


import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Das ist schön ;)");
        Comment c2 = new Comment("Gute Reise!");

        Post p1 = new Post(sdf.parse("21/12/2021 13:05:44"),
                "Weihnachten in Brasilien",
                "Ich werde dieses schöne Land besuchen",
                150);
        System.out.print("How many comments: ");
        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++){
            System.out.println("Enter with ur #"+(i+1)+"º commentary: ");
            String comment = sc.nextLine();
            Comment comments = new Comment(comment);
            p1.addComment(comments);
        }

        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);

        sc.close();
    }

}
