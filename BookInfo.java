public class BookInfo {
    public static void main(String[] args) {
        
    }
    
class Book {
    private final String title;
    private final String author;
    private final String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    // To display book info
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }

    // Equals method to compare books by ISBN
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book other) {
            return this.isbn.equals(other.isbn);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
}