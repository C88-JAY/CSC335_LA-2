package library;
import java.util.*;
public class MyLibrary {
    public static void main(String[] args){
        ArrayList<Book> library = new ArrayList<Book>();
        HashMap<String, Integer> ratings;
        HashMap<String, Boolean> readStatus;
    }

    public void search(){

    }

    public static void addBook(ArrayList<Book> library, String title, String author){
        library.add(new Book(title, author));
    }
}
