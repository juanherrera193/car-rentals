package repository.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("User with dni " + id + " not found");
    }
}
