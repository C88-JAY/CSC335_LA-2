package library;
public final class Book {
    private String author, title;


    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }
}
