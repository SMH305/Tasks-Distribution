package borrowing;
class Book {
    private String title;
    private String ISBN;
    private String author;
    private boolean isAvailable;
    private String borrower;
    
    // Add the author of the book with the book class " Added After Reviewed"
    public Book(String title, String ISBN, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.isAvailable = true;
        this.borrower = null;
    }
    public String getTitle(){
        return title;
    }
    public String getISBN() {
        return ISBN;
    }
    
    // Add the get method of author attribute with the book class " Added After Reviewed"
    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public String getBorrower() {
        return borrower;
    }
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
}
