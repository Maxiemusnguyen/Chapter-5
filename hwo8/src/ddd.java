import java.util.Scanner;

public class ddd {
    //boolean method
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    // void method
    public void printEven(boolean isEven) {
        if (isEven) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        ddd checker = new ddd();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isEven = checker.isEven(number);
        checker.printEven(isEven);
    }
}
