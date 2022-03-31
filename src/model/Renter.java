package model;

public class Renter extends User{
    private String SecondCellPhone;
    private String adreess;
    private String city;
    private String numberOfCard;
    private String franquise;

    public Renter(String firstName, String lastName, String dniType, String dni, String principalCellphone, String role,String secondCellPhone, String adreess, String city, String numberOfCard, String franquise) {
        super(firstName, lastName, dniType, dni, principalCellphone, role);
        this.adreess = adreess;
        this.city = city;
        this.numberOfCard = numberOfCard;
        this.franquise = franquise;
    }

    public String getSecondCellPhone() {return SecondCellPhone;}

    public void setSecondCellPhone(String secondCellPhone) {SecondCellPhone = secondCellPhone;}

    public String getAdreess() { return adreess; }

    public void setAdreess(String adreess) {this.adreess = adreess; }

    public String getCity() { return city; }

    public void setCity(String city) {this.city = city; }

    public String getNumberOfCard() {return numberOfCard; }

    public void setNumberOfCard(String numberOfCard) { this.numberOfCard = numberOfCard; }

    public String getFranquise() { return franquise;  }

    public void setFranquise(String franquise) {this.franquise = franquise; }

    @Override
    public String toString() {
        return "Renter{" +
                "SecondCellPhone='" + SecondCellPhone + '\'' +
                ", adreess='" + adreess + '\'' +
                ", city='" + city + '\'' +
                ", numberOfCard='" + numberOfCard + '\'' +
                ", franquise='" + franquise + '\'' +
                '}';
    }
}
