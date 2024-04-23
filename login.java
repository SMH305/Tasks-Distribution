import java.util.Scanner;

public class login {

    // variables to check the code because there isno actual database

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    // Scanner to read user's input

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Login System!");
        
        boolean isLoggedIn = false;

        // condition to check username and passsword

        while (!isLoggedIn) {

            // printing "enter username" and read

            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();
            
            // printing "enter password" and read password

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();
            
            // if statement

            if (authenticate(enteredUsername, enteredPassword)) {
                System.out.println("Login successful!");
                isLoggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        
        // close scanner
        
        scanner.close();
    }
    
    private static boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}