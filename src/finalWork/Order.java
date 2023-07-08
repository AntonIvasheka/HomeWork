package finalWork;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> clientOrder = new ArrayList<>();
    private LocalDateTime orderTime;
    public Order() {
        this.orderTime = LocalDateTime.now();
    }

    public List<Pizza> getClientOrder() {
        return clientOrder;
    }
    public void addToOrder(Pizza pizza) {
        clientOrder.add(pizza);
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
