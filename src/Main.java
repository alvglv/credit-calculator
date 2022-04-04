public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double result = service.calculate(1000000, 12);
        System.out.printf("%.0f %n", result);
        result = service.calculate(1000000, 24);
        System.out.printf("%.0f %n", result);
        result = service.calculate(1000000, 36);
        System.out.printf("%.0f %n", result);
    }
}