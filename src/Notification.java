import java.util.Date;

/**
 * This class will be responsible for sending notifications for flight reservations, flight status update, etc.
 */
public class Notification {
    private int notificationID;
    private Date createdOn;
    private String content;

    public boolean send(){
        return false;
    }

}
