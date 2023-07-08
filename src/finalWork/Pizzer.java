package finalWork;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pizzer implements IPizzeria{
    private Menu menu;
    private int orderId = 1;
    private LocalDateTime freeTime;
    private long busyTime = 0;
    public Pizzer(Menu menu) {
        this.menu = menu;
    }
    @Override
    public Menu getMenu() {
        return menu;
    }
    @Override
    public Receipt createReceipt(Order order) {
        Receipt clientReceipt = new Receipt(order);
        return  clientReceipt;
    }
    public int getId() {
        return orderId++;
    }
    @Override
    public void showReceiptInfo(Receipt receipt) {
        System.out.println("Номер заказа - " + getId());
        System.out.println("Время поступления заказа - " +
                receipt.getOrder().getOrderTime());
        System.out.println("Заказ - " + receipt.getOrderInfo());
        int size = receipt.getOrderInfo().size();
        System.out.println("Готовность заказа к выдаче в - " +
                receipt.getOrder().getOrderTime().plusMinutes(busyTime + size*15));
        freeTime = receipt.getOrder().getOrderTime().plusMinutes(size*15);
        System.out.println();
        //Новый заказ принимается к исполнению, после выполнения предыдущего
        if (freeTime.isBefore(LocalDateTime.now())) {
            busyTime = 0;
        } else {
            long minutes = ChronoUnit.MINUTES.between(LocalDateTime.now(), freeTime)+1;
            busyTime = size*15 - (size*15 - minutes);
        }
    }
    @Override
    public Order giveOrder(Receipt receipt) {
        return receipt.getOrder();
    }
}
