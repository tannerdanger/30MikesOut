import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * An itinerary can have multiple flights.
 */
public class Itinerary {
    private Airport startingAirport;
    private Airport finalAirport;
    private Date creationDate;
    private String customerID;


    public Itinerary(Airport theStart, Airport theFinal, Date theCreationDate, String theCustomerID){
        this.startingAirport = theStart;
        this.finalAirport = theFinal;
        this.creationDate = theCreationDate;
        this.customerID = theCustomerID;
    }


    public List<FlightReservation> getReservations(){
        return new ArrayList<>();
    }

    public boolean makeReservation(){
        return false;
    }

    public boolean makePayment(){
        return false;
    }
}
