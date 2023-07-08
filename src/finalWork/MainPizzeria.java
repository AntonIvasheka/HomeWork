package finalWork;

import java.util.List;

public class MainPizzeria {
    public static void main(String[] args) {
        List<Pizza> pizzaList = List.of(new Pizza("Карбонара"), new Pizza("Пеперонни"),
                new Pizza("Мясная"));
        Menu mainMenu = new Menu(pizzaList);

        Order order1 = new Order();
        Order order2 = new Order();
        Pizzer mainCafe = new Pizzer(mainMenu);
        System.out.println(mainCafe.getMenu());
        order1.addToOrder(pizzaList.get(0));
        order1.addToOrder(pizzaList.get(2));
        order2.addToOrder(pizzaList.get(1));
        mainCafe.showReceiptInfo(mainCafe.createReceipt(order1));
        mainCafe.showReceiptInfo(mainCafe.createReceipt(order2));
        mainCafe.giveOrder(new Receipt(order1));
        mainCafe.giveOrder(new Receipt(order2));
    }
}
