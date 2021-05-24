import datatypes.Address;

public class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;

    public Person(String theName, Address theAddress, String theEmail, String thePhone){
        this.name = theName;
        this.address = theAddress;
        this.email = theEmail;
        this.phone = thePhone;

    }

}
