package model;


public class Vehicle {
    private String brand;
    private String reference;
    private Integer mileage;
    private String model;
    private double price;
    private Integer availableQuantity;


    public Vehicle(){

    }
    public Vehicle(String brand, String reference, Integer mileage, String model, double price, Integer availableQuantity) {
        this.brand = brand;
        this.reference = reference;
        this.mileage = mileage;
        this.model = model;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }


    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public Integer getMileage() {
        return mileage;
    }
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    //toString
    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand + ", reference=" + reference + ", mileage=" + mileage + ", model=" + model + ", price=" + price + ", availableQuantity=" + availableQuantity + '}';
    }


}
