import datatypes.Address;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private String frequentFlierNumber;

    public Customer(String theName, Address theAddress, String theEmail, String thePhone, String theFrequentFlierNumber) {
        super(theName, theAddress, theEmail, thePhone);

        this.frequentFlierNumber = theFrequentFlierNumber;

    }

    private List<Itinerary> getItineraries(){
        return new ArrayList<>();
    }
}
