import java.util.ArrayList;
import java.util.List;

/**
 * The main entity of the system.
 * Each flight will have a flight number, departure and arrival airport, assigned aircraft, etc.
 */
public class Flight {
    private String flightNumber;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private int durationInMinutes;

    private List<WeeklySchedule> weeklySchedulesList;
    private List<CustomSchedule> customSchedulesList;
    private List<FlightInstance> flightInstancesList;

    public Flight(String theFlightNum, Airport theDeparture, Airport theArrival, int theDuration){
        this.flightNumber = theFlightNum;
        this.departureAirport = theDeparture;
        this.arrivalAirport = theArrival;
        this.durationInMinutes = theDuration;

        this.weeklySchedulesList = new ArrayList<>();
        this.customSchedulesList = new ArrayList<>();
        this.flightInstancesList = new ArrayList<>();

    }

    public List getInstances(){
        return new ArrayList();
    }

    public boolean cancel(){
        return false;
    }

    public boolean addFlightSchedule(){
        return false;
    }

}
