import java.util.Date;

public class Passenger {
    private String name;
    private String passportNumber;
    private Date dateOfBirth;

    public Passenger(String theName, String thePassportNum, Date theDoB){
        this.name = theName;
        this.passportNumber = thePassportNum;
        this.dateOfBirth = theDoB;

    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
