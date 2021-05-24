import java.sql.Time;
import java.util.Date;

public class CustomSchedule {
    private Date customDate;
    private Time departureTime;

    public CustomSchedule(Date theCustomDate, Time theDepartTime){
        this.customDate = theCustomDate;
        this.departureTime = theDepartTime;
    }
}
