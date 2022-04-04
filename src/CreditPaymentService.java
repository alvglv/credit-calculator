public class CreditPaymentService {
    public double calculate(int sum, int period) {
        double percentage = 9.99;
        double percentagePerMonth = percentage / (100 * 12);

        return sum * (percentagePerMonth / (1 - (Math.pow(1 + percentagePerMonth, -period))));
    }
}