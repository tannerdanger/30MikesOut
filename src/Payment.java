import datatypes.FlightStatus;

/**
 * Will be responsible for collecting payments from customers.
 */
public class Payment {
    private int paymentID;
    private double amount;
    private FlightStatus status;


    public boolean makeTransaction(){
        return false;
    }
}
