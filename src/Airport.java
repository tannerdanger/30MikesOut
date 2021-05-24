import datatypes.Address;

import java.util.ArrayList;
import java.util.List;

/**
 * Each airline operates out of different airports.
 * Each airport has a name, address, and a unique code.
 */
public class Airport {
    private String name;
    private Address address; //TODO: datatypes.Address object
    private String code;

    public Airport(String theName, Address theAddress, String theCode){
        this.name = theName;
        this.address = theAddress;
        this.code = theCode;

    }


    public List getFlights(){
        return new ArrayList();
    }
}
