package strategy_pattern_payment_system;

public class CryptoPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of " + amount);
    }
}