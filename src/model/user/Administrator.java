package model.user;

import model.user.User;

public class Administrator extends User {
    private String firstName;
    private String lastName;
    private int principalCellphone;
    private String role;


    public Administrator(String firstName, String lastName, String dniType, String dni, int principalCellphone, String role, String firstName1, String lastName1, int principalCellphone1, String role1) {
        super(firstName, lastName, dniType, dni, principalCellphone, role);
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.principalCellphone = principalCellphone1;
        this.role = role1;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getPrincipalCellphone() {
        return principalCellphone;
    }

    @Override
    public void setPrincipalCellphone(int principalCellphone) {
        this.principalCellphone = principalCellphone;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }
}
