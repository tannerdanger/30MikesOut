import java.sql.Time;

public class WeeklySchedule {
    private int dayOfWeek;
    private Time departureTime;

    public WeeklySchedule(int theDayOfWeek, Time theDepartureTime){
        this.dayOfWeek = theDayOfWeek;
        this.departureTime = theDepartureTime;
    }
}
