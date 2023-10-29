import java.util.Scanner;
public class kkk {
    private double height;
    private double width;
    public double calculateArea() {
        return height * width;
    }
    public boolean isLarge(int area) {
        return area > 300;
    }
    public void printSize(boolean isLarge) {
        if (isLarge) {
            System.out.println("This is a large rectangle.");
        } else {
            System.out.println("This is a small rectangle.");
        }
    }
    public static void main(String[] args) {
        kkk rectangle = new kkk();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle: ");
        rectangle.height = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        rectangle.width = scanner.nextDouble();
        double area = rectangle.calculateArea();
        boolean large = rectangle.isLarge((int) area);
        rectangle.printSize(large);
    }
}
