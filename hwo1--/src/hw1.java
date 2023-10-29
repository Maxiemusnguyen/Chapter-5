import java.util.Scanner;
public class hw1 {
    public String getString() {// INSTANCE METHOD HERE
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }
    public static void main(String[] args) { // GETTING A STRING BY USING INSTANCE METHOD
        hw1 textInput = new hw1();
        String textFromInstanceMethod = textInput.getString();
        System.out.println("Text from instance method: " + textFromInstanceMethod);
    }
}
