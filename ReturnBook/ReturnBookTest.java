package ReturnBook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ReturnBookTest {
    @Test
    public void testReturnBook_BookFound() {
        String isbn = "1234567890";
        List<Book> availableBooks = new ArrayList<>();
        availableBooks.add(new Book(isbn, "Software Engineering Project", "Ian Sommerville"));
        availableBooks.add(new Book("202105461", "Database Management", "Hector Garcia"));
        availableBooks.add(new Book("00110011", "Analysis and Design of Algorithms", "Rajesh K. Shukla"));

        ReturnBook returnBook = new ReturnBook(isbn);

        returnBook.returnBook(availableBooks);

        Assertions.assertEquals(3, availableBooks.size());
    }

    @Test
    public void testReturnBook_BookNotFound() {
        String isbn = "9876543210";
        List<Book> availableBooks = new ArrayList<>();
        availableBooks.add(new Book("1234567890", "Software Engineering Project", "Ian Sommerville"));
        availableBooks.add(new Book("202105461", "Database Management", "Hector Garcia"));
        availableBooks.add(new Book("00110011", "Analysis and Design of Algorithms", "Rajesh K. Shukla"));

        ReturnBook returnBook = new ReturnBook(isbn);

        returnBook.returnBook(availableBooks);

        Assertions.assertEquals(3, availableBooks.size());
    }
    // added to verify the content of the return receipt when the book is returned successfully.(updated after review)
    @Test
    public void testReturnBook_ReturnReceipt() {
        String isbn = "1234567890";
        List<Book> availableBooks = new ArrayList<>();
        availableBooks.add(new Book(isbn, "Software Engineering Project", "Ian Sommerville"));

        ReturnBook returnBook = new ReturnBook(isbn);

        // Redirect console output to capture it
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        returnBook.returnBook(availableBooks);

        // Reset console output
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        String expectedReceipt =
                "Title: Software Engineering Project\n" +
                "Author: Ian Sommerville\n" +
                "ISBN: 1234567890\n" +
                "Short Description: Software Engineering Project Book has been returned successfully.";

        Assertions.assertTrue(outputStream.toString().contains(expectedReceipt));
    }}