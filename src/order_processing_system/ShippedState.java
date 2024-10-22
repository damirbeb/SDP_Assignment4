package order_processing_system;

public class ShippedState implements State {
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    public void deliverOrder(Order order) {
        order.setState(new DeliveredState());
        System.out.println("Order delivered.");
    }

    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled after shipping.");
    }
}