import java.util.Scanner;

public class aaa {
    // INSTANCE METHOD HERE
    public String readString() {
        Scanner scanner = new Scanner(System.in); // SCANNER

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }
    public static void main(String[] args) {
        aaa reader = new aaa();
        String userInput = reader.readString();
        System.out.println("You entered: " + userInput);
    }
}
