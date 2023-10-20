import java.util.Scanner;

public class Exercise1 {

    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];

        System.out.println("Please enter ten double values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        System.out.println("The average of the values entered is: " + average(array));
    }
}
