package datatypes;

public class Address {
    public String streetAddress;
    public String city;
    public String state;
    public int zipcode;
    public String country;

    public Address(String theAddress, String theCity, String theState, int theZip, String theCountry){
        this.streetAddress = theAddress;
        this.city = theCity;
        this.state = theState;
        this.zipcode = theZip;
        this.country = theCountry;
    }

}
