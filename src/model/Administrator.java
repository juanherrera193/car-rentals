package model;

public class Administrator {
    private String firstName;
    private String lastName;
    private String principalCellphone;
    private String role;

    public Administrator(String firstName, String lastName, String principalCellphone, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.principalCellphone = principalCellphone;
        this.role = role;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {this.lastName = lastName; }

    public String getPrincipalCellphone() { return principalCellphone;  }

    public void setPrincipalCellphone(String principalCellphone) {this.principalCellphone = principalCellphone; }

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

    public Administrator() { super();  }

    @Override
    public String toString() {
        return "Administrator{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", principalCellphone='" + principalCellphone + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
