public class Exercise2 {
    public static void main(String[] args) {
        double tuition = 10000;
        double increaseRate = 0.05;

        for (int year = 1; year <= 10; year++) {
            tuition = tuition * (1 + increaseRate);
            System.out.printf("Tuition in year %d: $%.2f\n", year, tuition);
        }

        double totalCost = 0;
        for (int i = 0; i < 4; i++) {
            tuition = tuition * (1 + increaseRate);
            totalCost += tuition;
        }

        System.out.printf("Total cost of four years' worth of tuition after the tenth year: $%.2f", totalCost);
    }
}
