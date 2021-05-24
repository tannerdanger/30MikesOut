import datatypes.FlightStatus;

import java.sql.Time;

/**
 *  Each flight can have multiple occurrences; each occurrence will be considered a flight instance in our system.
 *
 *  For example, if a British Airways flight from London to Tokyo (flight number: BA212) occurs twice a week,
 *  each of these occurrences will be considered a separate flight instance in our system.
 */
public class FlightInstance {
    private Time departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;

    public FlightInstance(Time theDepartureTime, String theGate, FlightStatus theStatus, Aircraft theAircraft){
        this.departureTime = theDepartureTime;
        this.gate = theGate;
        this.status = theStatus;
        this.aircraft = theAircraft;
    }

    public boolean cancel(){
        return false;
    }

    public void updateStatus(FlightStatus theStatus){
        this.status = theStatus;
    }


}
