package entity;

public class ReservationEntity {
    private VehicleEntity vehicle;
    private AvailableEntity availableEntity;

    public ReservationEntity(VehicleEntity vehicle, AvailableEntity availableEntity) {
        this.vehicle = vehicle;
        this.availableEntity = availableEntity;
    }

    public VehicleEntity getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleEntity vehicle) {
        this.vehicle = vehicle;
    }

    public AvailableEntity getAvailable() {
        return availableEntity;
    }

    public void setAvailable(AvailableEntity availableEntity) {
        this.availableEntity = availableEntity;
    }


}
