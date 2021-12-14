package entities;

public class Cont {
    private int number;
    private String holder;
    private double balance;
    private String type;


    public Cont(int number, String holder, double balance, String type) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getNumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double quantity) {
        if (this.getType().equals("E")) {
            balance = (balance + quantity) - quantity * 5 / 100;
        }
        if (this.getType().equals("N")) {
            balance = balance + quantity;
        }
    }
        public void withDraw(double quantity){
            if (this.getType().equals("E")) {
                balance = (balance - quantity) - quantity * 5 / 100;
            }
            if (this.getType().equals("N")) {
                balance = balance - quantity;
        }

    }
    public String toString(){
        return number+", "+holder+", "+type+". Balance: "+String.format("%.2f",balance);
    }
}
