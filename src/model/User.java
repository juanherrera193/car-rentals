package model;

//Super class that we can use as super class for administrator and renter
public class User {
    private String firstName;
    private String lastName;
    private String dniType;
    private String dni;
    private String principalCellphone;
    private String role;

    public User(){}

    public User(String firstName, String lastName, String dniType, String dni, String principalCellphone, String role) {
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

    public void setFirstName(String firtName) {
        this.firstName = firtName;
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

    public String getPrincipalCellphone() {
        return principalCellphone;
    }

    public void setPrincipalCellphone(String principalCellphone) {
        this.principalCellphone = principalCellphone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString(){
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dniType='" + dniType + '\'' +
                ", dni='" + dni + '\'' +
                ", principalCellphone='" + principalCellphone + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
