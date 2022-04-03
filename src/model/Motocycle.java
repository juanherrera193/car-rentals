package model;

public class Motocycle extends Vehicle {
    private int cylindered;

    public Motocycle(){

    }
    public Motocycle(String brand, String reference, Integer mileage, String model, double price, Integer availableQuantity, int cylinderization) {
        super(brand, reference, mileage, model, price, availableQuantity);
        this.cylindered = cylinderization;
    }

    public int getCylindered() {
        return cylindered;
    }

    public void setCylindered(int cylindered) {
        this.cylindered = cylindered;
    }
}
