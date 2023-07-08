package finalWork;

import java.util.List;

public class Receipt {
    private Order order;
    public Receipt(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
    public List<Pizza> getOrderInfo() {
        return order.getClientOrder();
    }
}
