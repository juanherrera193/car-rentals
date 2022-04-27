package model.vehicle;

public class Motorcycle extends Vehicle{
    private double cylindered;

    public Motorcycle(String brand, String reference, Integer mileage, String model, double price, Integer availableQuantity, double cylindered){
        super(brand, reference, mileage, model, price, availableQuantity);
        this.cylindered = cylindered;
    }

    public double getCylindered() {
        return cylindered;
    }

    public void setCylindered(double cylindered) {
        this.cylindered = cylindered;
    }
}
