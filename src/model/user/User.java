package model.user;


import java.util.StringJoiner;

public class User {
    private String firstName;
    private String lastName;
    private String dniType;
    private String dni;
    private int principalCellphone;
    private String role;

      public User(String firstName, String lastName, String dniType, String dni, int principalCellphone, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dniType = dniType;
        this.dni = dni;
        this.principalCellphone = principalCellphone;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDniType() {
        return dniType;
    }

    public void setDniType(String dniType) {
        this.dniType = dniType;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPrincipalCellphone() {
        return principalCellphone;
    }

    public void setPrincipalCellphone(int principalCellphone) {
        this.principalCellphone = principalCellphone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
