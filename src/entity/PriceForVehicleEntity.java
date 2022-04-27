package entity;

public class PriceForVehicleEntity {
    private VehicleEntity vehicle;
    private  double price;

    public PriceForVehicleEntity(VehicleEntity vehicle, double price) {
        this.vehicle = vehicle;
        this.price = price;
    }

    public PriceForVehicleEntity(){
    }

    public VehicleEntity getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleEntity vehicle) {
        this.vehicle = vehicle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PriceForVehicleEntity{" + "vehicle=" + vehicle + ", price=" + price + '}';
    }
}
