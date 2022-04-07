package entity;

import entity.enumtype.TypeUser;
import model.user.User;

public class UserEntity {
    private Long id;
    private TypeUser typeOfUser;

    public UserEntity(Long id, TypeUser typeOfUser) {
        this.id = id;
        this.typeOfUser = typeOfUser;
    }

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeUser getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(TypeUser typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", typeOfUser=" + typeOfUser +
                '}';
    }
}
