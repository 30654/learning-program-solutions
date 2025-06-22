public class ForecastTool {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        double presentValue = 10000; // Initial investment
        double growthRate = 0.08;    // 8% annual growth
        int years = 5;               // Forecast for 5 years

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: ₹%.2f\n", years, futureValue);
    }
}
