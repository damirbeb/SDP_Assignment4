package order_processing_system;

public class CancelledState implements State {
    public void payOrder(Order order) {
        System.out.println("Order is cancelled.");
    }

    public void shipOrder(Order order) {
        System.out.println("Order is cancelled.");
    }

    public void deliverOrder(Order order) {
        System.out.println("Order is cancelled.");
    }

    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}