package order_processing_system;

public class NewState implements State {
    public void payOrder(Order order) {
        order.setState(new PaidState());
        System.out.println("Order paid.");
    }

    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped yet.");
    }

    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered yet.");
    }

    public void cancelOrder(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order cancelled.");
    }
}