package entity;

import entity.enumtype.TypeVehicle;

public class VehicleEntity {
    private Long id;
    private TypeVehicle type;
    private AvailableEntity availableEntity;

    public VehicleEntity() {
    }

    public VehicleEntity(TypeVehicle type) {
        this.type = type;
    }

    public VehicleEntity(Long id, TypeVehicle type) {
        this.id = id;
        this.type = type;
    }

    public VehicleEntity(Long id, TypeVehicle type, AvailableEntity availableEntity) {
        this.id = id;
        this.type = type;
        this.availableEntity = availableEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeVehicle getType() {
        return type;
    }

    public void setType(TypeVehicle type) {
        this.type = type;
    }

    public AvailableEntity getAvailable() {
        return availableEntity;
    }

    public void setAvailable(AvailableEntity availableEntity) {
        this.availableEntity = availableEntity;
    }

    @Override
    public String toString() {
        return "VehicleEntity [id=" + id + ", type=" + type + "]";
    }
}
