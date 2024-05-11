package borrowing;

class Book {
    private String title;
    private String ISBN;
    private String author;
    private boolean isAvailable;
    private String borrower;

    public Book(String title, String ISBN, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.isAvailable = true;
        this.borrower = null;
    }

    // Get and Set Methods
    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

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