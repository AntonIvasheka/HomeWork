package finalWork;

import java.util.List;

public class Menu {
    private List<Pizza> pizzaList;
    public Menu(List<Pizza> pizzaList){
        this.pizzaList = pizzaList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    @Override
    public String toString() {
        return "Меню пиццерии :" + getPizzaList();
    }
}
