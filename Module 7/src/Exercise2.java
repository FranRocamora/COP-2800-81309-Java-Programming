import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int index = 0;

        for (int i : list) {
            if (!contains(temp, i)) {
                temp[index++] = i;
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    private static boolean contains(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            list[i] = scanner.nextInt();
        }

        int[] distinctArray = eliminateDuplicates(list);
        System.out.print("The distinct numbers are: ");
        for (int i : distinctArray) {
            System.out.print(i + " ");
        }
    }
}
