import java.util.Scanner;
public class LibraryMangementSystem {
    private int userID;
    protected String password;
    private String userType;

public LibraryMangementSystem(int userID, String password, String userType) {
    this.userID = userID;
    this.password = password;
    this.userType = userType;
}
public void login() {
    @SuppressWarnings("resource")
    Scanner loginScanner = new Scanner(System.in);
    System.out.println("What is your userID and password?");
    String userAndPass = loginScanner.next();
    System.out.println("your password and username is: " + userAndPass + " You are now signed in!");
    this.password = userAndPass;
    }

public void register() {
    @SuppressWarnings("resource")
    Scanner registerScanner = new Scanner(System.in);
    System.out.println("To register for a new account please enter your name");
    @SuppressWarnings("unused")
    String name = registerScanner.next();
    System.out.println("To continue registering please enter your preferred password");
    @SuppressWarnings("unused")
    String password = registerScanner.next();
    int userID = (int)(Math.random()*1000001)+1;
    System.out.println("your new UserID is: " + userID + "You have successfully registered for an account");
    this.userID = userID;
}
public void logout() {
    System.out.println("loggout was successful");
}

public String getUserType() {
    return userType;
}

public int getUserID() {
    return userID;
}

public String getPassword() {
    return password;
}
}