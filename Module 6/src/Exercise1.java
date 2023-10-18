public class Exercise1 {
    public static void main(String[] args) {
        
        long number = 234;
        System.out.println("Sum of digits in " + number + " is: " + sumDigits(number));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
