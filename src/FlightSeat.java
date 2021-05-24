/**
 * This class will represent all seats of an aircraft assigned to a specific flight instance.
 * All reservations of this flight instance will assign seats to passengers through this class.
 */
public class FlightSeat {
    private double fare;
    private String reservationNumber;

    private FlightSeat(double theFare){
        this.fare = theFare;
    }

    public double getFare(){
        return this.fare;
    }
}
