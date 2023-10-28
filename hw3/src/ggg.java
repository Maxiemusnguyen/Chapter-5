import java.util.Scanner;

public class ggg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = readString(scanner);
        System.out.println("You entered: " + inputString);
    }

    public static String readString(Scanner scanner) {
        String userInput = scanner.nextLine();
        return userInput;
    }
}
