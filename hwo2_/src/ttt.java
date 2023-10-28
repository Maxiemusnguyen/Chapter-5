import java.util.Scanner;
public class ttt{
    public static String readString(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();
        return input;

    }
    public static void main(String[]args){
        String userInput = readString();
        System.out.println("You entered"+ userInput);

    }
}