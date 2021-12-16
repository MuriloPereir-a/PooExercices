package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date date;

    public UsedProduct(){}

    public UsedProduct(String name, Double price, Date date) {
        super(name, price);
        this.date = date;
    }
    @Override
    public String pay(){
        return getName() + " (used) $"
                +String.format("%.2f",super.getPrice())+
                " (Manufacture date: "+sdf.format(date)+")";
    }

}
