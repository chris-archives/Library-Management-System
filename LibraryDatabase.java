import java.util.ArrayList;
public class LibraryDatabase extends Book {

    private ArrayList<Book> database = new ArrayList<Book>();

    public LibraryDatabase(String title, String author, String genre, int feedback, int feedbackCounter, String info, boolean reservationStatus, ArrayList<Book>database) {
        super(title, author, genre, feedback, feedbackCounter, info, reservationStatus);
        this.database = database;
}
    public void getDatabase() {
        for (int i = 0; i < database.size(); i++) {
            System.out.println(database.get(i));
        }
    }
    public void removeBook(Book name) {
        for (int i = database.size() - 1; i <= 0; i++) {
            Book remove = database.get(i);
            if (name.equals(remove)) {
                database.remove(i);
            }
        }
        System.out.println("The book " + name + "was successfully removed from the database"); 
        }
    public boolean getReservationStatus() {
            boolean rs = super.getReservationStatus();
            if (rs) {
                System.out.println("this book is aviable");
        }
            if (!rs) {
                System.out.println("this book is unaviable");
        }
            return rs;
    }
    public void searchDatabase(Book name) {
        for (int i = 0; i < database.size(); i++) {
            if (name.equals(database.get(i)));
            System.out.println("this book was found within out database at index: " + i);
        }
        else{
            System.out.println("This book was not found within our database"); 
        }
    }
    public void addBook(Book name) {
        database.add(name);
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


