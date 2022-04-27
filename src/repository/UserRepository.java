package repository;

import entity.UserEntity;
import repository.exception.UserNotFoundException;

import java.util.List;

public class UserRepository {

    List<UserEntity> users;

    public UserRepository(List<UserEntity> users) {
        this.users = users;
    }

    public UserEntity getUser(Long id) {
        for (UserEntity user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new UserNotFoundException(id);
    }

    public UserEntity addUser(UserEntity user) {
        users.add(user);
        return user;
    }

    public boolean deleteUser(Long id) {
        for (UserEntity u : users) {
            if (u.getId().equals(id)) {
                users.remove(u);
                return true;
            }
        }
        return false;
    }

    public UserEntity updateUser(UserEntity user) {
        for (UserEntity u : users) {
            if (u.getId().equals(user.getId())) {
                users.remove(u);
                users.add(user);
                return user;
            }
        }
        throw new UserNotFoundException(user.getId());
    }

}
