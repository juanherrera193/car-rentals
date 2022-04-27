package repository.uploadStaticInformation;

import entity.UserEntity;
import entity.enumtype.TypeUser;

import java.util.Optional;

public class UserInformation {

    public static Optional<UserEntity> UserEntityOne(){
        return Optional.of(new UserEntity(1L, TypeUser.ADMINISTRATOR));
    }

    public static Optional<UserEntity> UserEntityTwo(){
        return Optional.of(new UserEntity(2L, TypeUser.RENTER));
    }

    public static Optional<UserEntity> UserEntityThree(){
        return Optional.of(new UserEntity(3L, TypeUser.RENTER));
    }

    public static Optional<UserEntity> UserEntityFour(){
        return Optional.of(new UserEntity(4L, TypeUser.RENTER));
    }

}
