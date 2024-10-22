package order_processing_system;

public interface State {
    void payOrder(Order order);
    void shipOrder(Order order);
    void deliverOrder(Order order);
    void cancelOrder(Order order);
}