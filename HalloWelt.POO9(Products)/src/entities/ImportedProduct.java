package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public double totalPrice(){
        return this.getPrice() + customsFee;
    }
    @Override
    public String pay(){
        return getName()
                + " (Customs fee: $ "+String.format("%.2f", customsFee)+")";
    }
}
