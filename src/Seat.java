import datatypes.SeatClass;
import datatypes.SeatType;

public class Seat {
    private String seatNumber;
    private SeatType type;
    private SeatClass seatClass;

    public Seat (String theSeatNum, SeatType theType, SeatClass theClass){
        this.seatNumber = theSeatNum;
        this.type = theType;
        this.seatClass = theClass;
    }

    private SeatType getSeatType(){
        return this.type;
    }
}
