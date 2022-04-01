package model;

public class motocicle extends Vehicle {
    private int cylinderization;

    public motocicle(String brand, String reference, Integer mileage, String model, double price, Integer availableQuantity, int cylinderization) {
        super(brand, reference, mileage, model, price, availableQuantity);
        this.cylinderization = cylinderization;
    }

    public int getCylinderization() {
        return cylinderization;
    }

    public void setCylinderization(int cylinderization) {
        this.cylinderization = cylinderization;
    }

    @java.lang.Override
    public java.lang.String toString() {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder("motocicle{");
        sb.append("cylinderization=").append(cylinderization);
        sb.append('}');
        return sb.toString();
    }
}
