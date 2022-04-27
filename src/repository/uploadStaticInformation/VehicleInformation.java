package repository.uploadStaticInformation;

import entity.AvailableEntity;
import entity.UserEntity;
import entity.VehicleEntity;
import entity.enumtype.TypeUser;
import entity.enumtype.TypeVehicle;

import java.util.Optional;

public class VehicleInformation {

    public static Optional<VehicleEntity> UserEntityOne(){
        return Optional.of(new VehicleEntity(1L, TypeVehicle.TRUCK, new AvailableEntity(true)));
    }

    public static Optional<VehicleEntity> UserEntityTwo(){
        return Optional.of(new VehicleEntity(1L, TypeVehicle.SEDAN, new AvailableEntity(true)));
    }

    public static Optional<VehicleEntity> UserEntityThree(){
        return Optional.of(new VehicleEntity(1L, TypeVehicle.MOTORCYCLE, new AvailableEntity(true)));
    }

    public static Optional<VehicleEntity> UserEntityFour(){
        return Optional.of(new VehicleEntity(1L, TypeVehicle.SEDAN, new AvailableEntity(true)));
    }

}
