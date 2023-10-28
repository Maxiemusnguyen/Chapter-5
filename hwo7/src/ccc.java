import java.util.Scanner;

public class ccc {
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }
    public static void main(String[] args) {
        String input = getInput();
        System.out.println("User entered: " + input);
    }
}