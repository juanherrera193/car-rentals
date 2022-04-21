package repository;

import entity.VehicleEntity;
import repository.exception.VehicleNotFoundException;

import java.util.List;

public class VehicleRepository {
    private List<VehicleEntity> vehicles;

    public List<VehicleEntity> getVehicles() {
        return vehicles;
    }

    public VehicleEntity saveVehicle(VehicleEntity vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }

    public void removeVehicle(VehicleEntity vehicle) {
        Long idRemoved = vehicle.getId();
        vehicles.remove(vehicle);
    }

    public VehicleEntity findVehicleById(Long id) {
        for (VehicleEntity vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                return vehicle;
            }
        }
        throw new VehicleNotFoundException(id);
    }

    public VehicleEntity updateVehicle(VehicleEntity vehicle, Long id) {
        for (VehicleEntity vehicleIterator : vehicles) {
            if (vehicleIterator.getId().equals(id)) {
                vehicleIterator.setAvailable(vehicle.getAvailable());
                vehicleIterator.setType(vehicle.getType());
                return vehicleIterator;
            }
        }
        throw new VehicleNotFoundException(id);
    }
}
