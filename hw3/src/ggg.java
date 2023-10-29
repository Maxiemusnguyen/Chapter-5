import java.util.Scanner;

public class ggg {
    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
    public static void main(String[] args) {
        String userInput = readString();
        System.out.println("You entered: " + userInput);
    }
}
