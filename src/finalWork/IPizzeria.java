package finalWork;

public interface IPizzeria {
    Menu getMenu();
    Receipt createReceipt(Order order);
    void showReceiptInfo(Receipt receipt);
    Order giveOrder(Receipt receipt);
}
