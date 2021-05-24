import datatypes.FlightStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * A reservation is made against a flight instance and has attributes like a unique reservation number,
 * list of passengers and their assigned seats, reservation status, etc.
 */
public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private Aircraft aircraft;
    private HashMap<Passenger, FlightSeat> seatMap;
    private FlightStatus status;
    private Date creationDate;


    public FlightReservation(String theResNumber, FlightInstance theFlight, Aircraft theAircraft, Date theCreationDate, FlightStatus theStatus){
        this.reservationNumber = theResNumber;
        this.flight = theFlight;
        this.aircraft = theAircraft;
        this.creationDate = theCreationDate;
        this.status = theStatus;
        this.seatMap = new HashMap<>();
    }


    public List<Passenger> getPassengers(){
        return new ArrayList<Passenger>();
    }

    //TODO:
    public void fetchReservationDetails(String reservationNumber){

    }
}
