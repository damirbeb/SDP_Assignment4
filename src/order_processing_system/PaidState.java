package order_processing_system;

public class PaidState implements State {
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    public void shipOrder(Order order) {
        order.setState(new ShippedState());
        System.out.println("Order shipped.");
    }

    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered yet.");
    }

    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled after payment.");
    }
}