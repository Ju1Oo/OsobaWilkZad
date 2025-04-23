public class Adres {

    //Klasa z biura podrozy w razie potrzeby dodac nowe funkcjonalnosci

    private String street;
    private String city;
    private String apartmentNumber;
    private String postalCode;

    // Constructor
    public Adres(String street, String city, String apartmentNumber, String postalCode) {
        this.street = street;
        this.city = city;
        this.apartmentNumber = apartmentNumber;
        this.postalCode = postalCode;
    }

    // Getter methods
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
