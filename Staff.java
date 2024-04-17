public class Staff extends User {

    private String school;

public Staff(int userID, String password, String userType, String name, int ID, String school) {
        super(ID, name, password, userType, ID);
    this.school = school;
}
public void getAccountInfo() {
    System.out.println("Name: " + super.getName());
    System.out.println("your userID is: " + super.getUserID());
    System.out.println("you work at this school: + " + school);
}
}
