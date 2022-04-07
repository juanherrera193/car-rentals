package repository;

import entity.VehicleEntity;

import java.util.List;

public class VehicleRepository {
    private final List<VehicleEntity> vehicles;

    public VehicleRepository(List<VehicleEntity> vehicles) {
        this.vehicles = vehicles;
    }

    public List<VehicleEntity> getVehicles() {
        return vehicles;
    }

    public String saveVehicle(VehicleEntity vehicle) {
        vehicles.add(vehicle);
        return "Vehicle saved" + vehicle.getId();
    }

    public String removeVehicle(VehicleEntity vehicle) {
        Long idRemoved = vehicle.getId();
        vehicles.remove(vehicle);
        return idRemoved + " removed";
    }

    public String findVehicleById(Long id) {
        for (VehicleEntity vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                return vehicle + " " + vehicle.getAvailable().toString();
            }
        }
        return null;
    }

    public String updateVehicle(VehicleEntity vehicle, Long id){
        for (VehicleEntity vehicleIterator : vehicles){
            if (vehicleIterator.getId().equals(id)){
                vehicleIterator.setAvailable(vehicle.getAvailable());
                vehicleIterator.setType(vehicle.getType());
                return "Vehicle updated";
            }
        }
        return "Vehicle not found and not updated";
        }
}
