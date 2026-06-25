public class Main {

    public static void main(String[] args) {

        double initialAmount = 10000;
        double annualGrowth = 0.10;
        int duration = 3;

        double estimatedValue =
                FinancialForecast.predictFutureValue(
                        initialAmount,
                        annualGrowth,
                        duration
                );

        System.out.printf(
                "Estimated Future Value: %.2f",
                estimatedValue
        );
    }
}