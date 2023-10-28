import java.util.Scanner;

public class bbb {
    // Static method
    public static String readString(Scanner scanner) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        bbb reader = new bbb();
        Scanner scanner = new Scanner(System.in); // Scanner instance

        String userInput = reader.readString(scanner);
        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}
