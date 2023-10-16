public class Exercise1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Miles\tKilometers");
        for (int i = 1; i <= 10; i++) {
            double kilometers = i * 1.609;
            System.out.printf("%d\t\t%.3f\n", i, kilometers);
        }
    }
}
