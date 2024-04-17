public class Student extends User{

        private String school;
    
public Student(int userID, String password, String userType, String name, int ID, String school) {
        super(userID, password, userType, name, ID);
        this.school = school;
    }
public void getAccountInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("your userID is: " + super.getUserID());
        System.out.println("you study at this school: " + school);
    }
}
