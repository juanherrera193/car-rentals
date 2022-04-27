package model.vehicle;

public class Truck extends Vehicle {
    Boolean luggage;
    int seats;
    String fuelType;

    public Truck(String brand, String reference, Integer mileage, String model, double price, Integer availableQuantity, Boolean luggage, int seats, String fuelType) {
        super(brand, reference, mileage, model, price, availableQuantity);
        this.luggage = luggage;
        this.seats = seats;
        this.fuelType = fuelType;
    }

    public Boolean getLuggage() {
        return luggage;
    }

    public void setLuggage(Boolean luggage) {
        this.luggage = luggage;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
