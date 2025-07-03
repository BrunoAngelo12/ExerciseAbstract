package app.entities;

public class Individual extends Person{
    private Double healthExpenses;

    @Override
    public double calculateTax() {
        double taxAmount = 0.0;
        double taxHealth = 0.0;
        if (this.annualIncome < 20000){
            taxAmount = (15 / 100) * this.annualIncome;
        }else{
            taxAmount = (25 / 100) * this.annualIncome;
        }
        if (this.healthExpenses>0){
            taxHealth = this.healthExpenses / 2;
        }else{
            taxHealth = 0;
        }
        return taxAmount - taxHealth;
    }

    public Individual(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    
}
