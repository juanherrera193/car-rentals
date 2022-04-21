package repository.exception;

public class VehicleNotFoundException extends RuntimeException{
    public VehicleNotFoundException(Long id) {
        super("Vehicle with id " + id + " not found");
    }
}
