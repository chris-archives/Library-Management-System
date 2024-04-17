public class User extends LibraryMangementSystem{
    protected String name;
    protected static int ID;

public User(int userID, String password, String userType, String name, int ID) {
    super(ID, password, userType);
    this.name = name;
    this.ID = ID;
}

public int getUserID() {
    int ID = super.getUserID();
    return ID;
}

public String getName() {
    return name;
}

public String checkAccountType() {
    String userType = super.getUserType();
    return userType;
}
public void returnBook(String bookName) {
    System.out.println("The book " + bookName + "has been returned");
}
public void borrowBook(String bookname) {
    System.out.println("The book " + bookname + "was successfully borrow");
}
}