package strategy_pattern_payment_system;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment());
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(50);

        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(200);
    }
}