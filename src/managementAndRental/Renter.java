package managementAndRental;

public class Renter extends User{
    private int SecondCellPhone;
    private String adreess;
    private String city;
    private int numberOfCard;
    private String franquise;


    public Renter(String firstName, String lastName, String dniType, String dni, int principalCellphone, String role, int secondCellPhone, String adreess, String city, int numberOfCard, String franquise) {
        super(firstName, lastName, dniType, dni, principalCellphone, role);
        SecondCellPhone = secondCellPhone;
        this.adreess = adreess;
        this.city = city;
        this.numberOfCard = numberOfCard;
        this.franquise = franquise;
    }

    public int getSecondCellPhone() {
        return SecondCellPhone;
    }

    public void setSecondCellPhone(int secondCellPhone) {
        SecondCellPhone = secondCellPhone;
    }

    public String getAdreess() {
        return adreess;
    }

    public void setAdreess(String adreess) {
        this.adreess = adreess;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public String getFranquise() {
        return franquise;
    }

    public void setFranquise(String franquise) {
        this.franquise = franquise;
    }
}
