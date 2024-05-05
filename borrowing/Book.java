package borrowing;

class Book {
    private String title;
    private String ISBN;
    private boolean isAvailable;
    private String borrower;

    public Book(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
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