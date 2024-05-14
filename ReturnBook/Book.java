package ReturnBook;
// Add title and author attributes to the book class


public class Book {
    private String isbn;
    private String title;
    private String author;


        public Book(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }
        // Add get method for title and author (updated aftar review)
    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAuthor() {
        return author;
    }
}