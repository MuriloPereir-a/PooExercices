package application;

public class Exercice10 {
    public static int sum(int n){
        int tot = 0;
        for(int i = 0; i<= n;i++){
            tot += i;
        }
        return tot;
    }
    public static void main(String[] args) {
        System.out.println(sum(1));
    }

}
