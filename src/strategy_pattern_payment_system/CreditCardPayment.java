package strategy_pattern_payment_system;

public class CreditCardPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}