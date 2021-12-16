package entities;



public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(){}

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
       double x = 0;

                if(getAnualIncome() <= 20000 && healthExpenditures == 0){
                   x = getAnualIncome() * 15/100;
                }
                if(getAnualIncome() <= 20000 && healthExpenditures > 0){
                    x = (getAnualIncome() * 15/100) - (healthExpenditures * 50/100);
                }
                if(getAnualIncome() > 20000 && healthExpenditures == 0){
                    x = getAnualIncome() * 25/100;
                 }
                if(getAnualIncome() > 20000 && healthExpenditures > 0){
                    x = (getAnualIncome() * 25/100) - (healthExpenditures * 50/100);
                }

        return  x;
    }

}
