import java.util.Scanner;
public  class AccountInfo extends User {
    private int amtBorrowBook;
    private int amtReservedBook;
    private int amtReturnedBook;
    private int amtLostbook;
    private int amtFined;

public AccountInfo(int userID, String password, String userType, String name, int amtBorrowBook, int amtReservedBook, 
int amtReturnedBook, int amtLostbook, int amtFined) {
    super(userID, password, userType, name, ID);
    this.amtBorrowBook = amtBorrowBook;
    this.amtReservedBook = amtReservedBook;
    this.amtReturnedBook = amtReturnedBook;
    this.amtLostbook = amtLostbook;
    this.amtFined = amtFined;
}
    public void getAccountInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("your userID is: " + super.getUserID());
}
    public int getAmtBorrowBook() {
        return amtBorrowBook;
    }
    public int getAmtReservedBook() {
        return amtReservedBook;
    }
    public int getAmtReturnedBook() {
        return amtReturnedBook;
    }
    public int getAmtLostBook() {
        return amtLostbook;
    }
    public int amtFined() {
        Scanner fined = new Scanner(System.in);
        System.out.println("how many books have you returned late?");
        int finesLate = fined.nextInt();
        System.out.println("Every book which you have yet to return costs $4");
        System.out.println("Every book that is turned in late costs 50 cent");
        int fine = 4 * amtLostbook;
        fine += (0.5 * finesLate);
        amtFined = fine;
        return amtFined;
    }
    


}
