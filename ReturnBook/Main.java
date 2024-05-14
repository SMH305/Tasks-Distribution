/*Please add a reciept feature that provides user's return details
 Signed by: Hala Khalid 202106069
 Date: 13/5/2024
 */
package ReturnBook;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> availableBooks = new ArrayList<>();
         // Add the values of the new attributes "title" and "author" (updated aftar review)
         availableBooks.add(new Book("1234567890", "Software Engineering Project", "Ian Sommerville"));
         availableBooks.add(new Book("202105461", "Database Management", "Hector Garcia"));
         availableBooks.add(new Book("00110011", "Analysis and Design of Algorithms", "Rajesh K. Shukla"));

   
        List<User> users = new ArrayList<>();
        users.add(new User("samaa", "123456"));
        users.add(new User("hala", "123456"));
        users.add(new User("malak", "123456"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Online Library Management System");
        System.out.println();
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isLoggedIn = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                isLoggedIn = true;
                break;
            }
        }

        if (isLoggedIn) {
            System.out.print("Enter the ISBN of the book: ");
            String isbn = scanner.nextLine();

            ReturnBook returnBook = new ReturnBook(isbn);
            returnBook.returnBook(availableBooks);
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
    
}