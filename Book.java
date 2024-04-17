import java.util.ArrayList;
import java.util.Scanner;
public class Book {
    private String title;
    private String author;
    private String genre;
    private int feedback;
    private int feedbackCounter;
    private String info;
    private boolean reservationStatus;
    private ArrayList<String>bookBin;

    public Book(String title, String author, String genre, int feedback, int feedbackCounter, String info, boolean reservationStatus, ArrayList<String>bookBin) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.feedback = feedback;
        this.feedbackCounter = feedbackCounter;
        this.info = info;
        this.reservationStatus = reservationStatus;
        this.bookBin = bookBin;
    }
    public void getBookBin() {
        for (int i = 0; i < bookBin.size(); i++) {
            System.out.println(bookBin.get(i));
    }
}
    public void getReservationStatus() {
    if (reservationStatus) {
        System.out.println("this book is aviable");
    }
    if (!reservationStatus) {
        System.out.println("this book is unaviable");
    }
    }

    public void giveFeedback() {
        feedbackCounter++;
        System.out.println("Rate this book 1 - 5,");
        Scanner feedbackScanner = new Scanner(System.in);
        double avgFeedback = feedbackScanner.nextInt();
        avgFeedback += feedback;
        avgFeedback/=feedbackCounter;
        System.out.println("Thank you for providing feedback, after your rating this book had an average rating of: " + avgFeedback);
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getFeedback() {
        return feedback;
    }
    public String getBookInfo() {
        return info;
    }
    }
