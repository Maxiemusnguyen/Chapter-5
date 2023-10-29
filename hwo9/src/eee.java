import java.util.Scanner;
public class eee {
    public static void printFib(int n) {
        if (n >= 1) {
            System.out.print("1 ");
        }
        if (n >= 2) {
            System.out.print("2 ");
        }
        int r0 = 1, r1 = 1, r;
        for (int i = 3; i <= n; i++) {
            r = r0 + r1;
            r0 = r1;
            r1 = r;
            System.out.print(r + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        char choice;
        while (true) {
            System.out.print("Enter a positive integer: ");
            n = in.nextInt();
            printFib(n);
            System.out.print("Do you want to try again(y or n): ");
            choice = in.next().charAt(0);
            if (choice == 'n' || choice == 'N')
                break;
        }
    }
}
