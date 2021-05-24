import java.util.ArrayList;
import java.util.List;

/**
 * Airlines own or hire aircraft to carry out their flights.
 * Each aircraft has attributes like name, model, manufacturing year, etc.
 */
public class Aircraft {
    private String name;
    private String model;
    private int manufacturedYear;
    private List<Seat> seatsList;

    public Aircraft(String theName, String theModel, int theYear){
        this.name = theName;
        this.model = theModel;
        this.manufacturedYear = theYear;

        this.seatsList = new ArrayList<>();
    }

    private List getFlights(){
        return new ArrayList();
    }
}
