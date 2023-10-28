import java.util.Scanner;

public class zzz {

    // Class method to get a string from the user
    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close(); // Close the scanner to release resources
        return input;
    }

    public static void main(String[] args) {
        // Using the class method to get a string
        String userString = zzz.getString();
        System.out.println("You entered: " + userString);
    }
}
