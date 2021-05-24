import datatypes.AccountStatus;

public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    public Account(String theId, String thePW, AccountStatus theStatus){
        this.id = theId;
        this.password = thePW;
        this.status = theStatus;
    }

    public boolean resetPassword(){
        return true;
    }
}
