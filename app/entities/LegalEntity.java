package app.entities;

public class LegalEntity extends Person{
    
    private Integer numberOfEmployees;    

    public LegalEntity(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double calculateTax() {
        double taxAmount = 0.0;
        if(this.numberOfEmployees > 10){
            taxAmount = (14 / 100) * this.annualIncome;
        }else{
            taxAmount = (16 /100) * this.annualIncome;
        }
        return taxAmount;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
}
