public class sum {
    public int sum(int a, int b) {
        System.out.println("Calling sum(int, int)");
        return a + b;
    }
    public double sum(double a, double b) {
        System.out.println("Calling sum(double, double)");
        return a + b;
    }
    public double sum(double a, int b) {
        System.out.println("Calling sum(double, int)");
        return a + b;
    }
    public static void main(String[] args) {
        sum calculator = new sum();

        // Calling the sum(int, int) method
        int intSum = calculator.sum(5, 7);
        System.out.println("Sum of integers: " + intSum);

        // Calling the sum(double, double) method
        double doubleSum = calculator.sum(3.5, 2.0);
        System.out.println("Sum of doubles: " + doubleSum);

        // Calling the sum(double, int) method
        double mixedSum = calculator.sum(4.0, 3);
        System.out.println("Sum of double and int: " + mixedSum);
    }
}
