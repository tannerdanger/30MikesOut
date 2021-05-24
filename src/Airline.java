import java.util.ArrayList;
import java.util.List;

/**
 * The main part of the organization for which this software has been designed.
 * It has attributes like ‘name’ and an airline code to distinguish the airline from other airlines.
 */
public class Airline {
    private String name;
    private String code;

    public Airline(String theName, String theCode){
        name = theName;
        code = theCode;
    }

    public List getFlights(){

        return new ArrayList();
    }


}
