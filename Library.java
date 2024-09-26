package library;
import java.util.*;
public class Library {
    private ArrayList<Book> library;
    // Only add the rating to the dictionary once the book has been read
    private HashMap<String, Integer> ratings;
    // Only add the rating 
    private HashMap<String, Boolean> readStatus;

    public Library(){
        library = new ArrayList<Book>();
        ratings = new HashMap<String, Integer>();
        readStatus = new HashMap<String, Boolean>();
    }

    public ArrayList<Book> getBookList(){
        return new ArrayList<Book>(library);
    }
    
    public void addBook(String title, String author){
        assert title != null && author != null;
        Book bookToAdd = new Book(title, author);
        library.add(bookToAdd);
        readStatus.put(title, false);
    }

    public void setToRead(String title){
        readStatus.put(title, true);
    }

    public void rate(String title, int rating){
        ratings.put(title, rating);
    }
}  

