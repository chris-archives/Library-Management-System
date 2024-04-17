import java.util.ArrayList;

public class Librarian extends LibraryDatabase {
    private String name;
    private String password;
    private int librarianID;

public Librarian(String title, String author, String genre, int feedback, int feedbackCounter, String info, boolean reservationStatus, 
ArrayList<Book>database, String name, String password, int librarianID) {
    super(title, author, genre, feedback, feedbackCounter, info, reservationStatus, database);
    this.name = name;
    this.password = password;
    this.librarianID = librarianID;
}
public void searchDatabase(Book name) {
    super.searchDatabase(null);
}
public void addBook(Book name) {
    super.addBook(null);
}
public boolean getReservationStatus() {
    return super.getReservationStatus();
}
public String getName() {
    return name;
}
public String getPassword() {
    return password;
}
public int getLibrarianID() {
    return librarianID;
}
public String getTitle() {
    return super.getTitle();
}
public String getAuthor() {
    return super.getAuthor();
}
public String getGenre() {
    return super.getGenre();
}
public int getFeedback() {
    return getFeedback();
}
public String getInfo() {
    return getBookInfo();
}
}