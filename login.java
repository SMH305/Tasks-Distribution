import java.util.Scanner;

public class login {
    
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Login System!");
        
        boolean isLoggedIn = false;
        
        while (!isLoggedIn) {
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();
            
            if (authenticate(enteredUsername, enteredPassword)) {
                System.out.println("Login successful!");
                isLoggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        
        // Here you can add the main menu or functionality after successful login
        
        scanner.close();
    }
    
    private static boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}