package model;

import java.util.Objects;

public class Sedan extends Vehicle{
    private int seats;
    private Boolean luggage;
    private String fuelType;

    public Sedan(String brand, String reference, Integer mileage, String model, double price, Integer availableQuantity, int seats, Boolean luggage, String fuelType){
        super(brand, reference, mileage, model, price, availableQuantity);
        this.seats = seats;
        this.luggage = luggage;
        this.fuelType = fuelType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Boolean getLuggage() {
        return luggage;
    }

    public void setLuggage(Boolean luggage) {
        this.luggage = luggage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + "Sedan{" + "seats=" + seats + ", luggage=" + luggage + ", fuelType=" + fuelType + '}';
    }
}
