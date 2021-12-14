package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;

    private Client client;

    List<OrderItem> orderItems = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }
    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }
    public double total(){
        double sum = 0;
        for (OrderItem x : orderItems){
            sum += x.subTotal();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)+"\n");
        sb.append("Order Status: ");
        sb.append(status+"\n");
        sb.append(client.toString()+"\n");
        sb.append("ORDER ITEMS: \n");
        for(OrderItem items : orderItems){
            sb.append("-"+items.toString()+"\n");
        }

        sb.append("TOTAL PRICE: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();

    }
}
