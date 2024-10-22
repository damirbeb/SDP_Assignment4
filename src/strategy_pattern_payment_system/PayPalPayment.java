package strategy_pattern_payment_system;

public class PayPalPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}