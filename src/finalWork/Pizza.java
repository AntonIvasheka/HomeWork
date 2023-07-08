package finalWork;

public class Pizza {
    private String pizzaName;

    public Pizza(String pizzaName){
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }
    public int cookingTime() { // Время приготовления пиццы(любой)
        return 15;
    }
    @Override
    public String toString() {
        return "Пица " + "'" + getPizzaName() + "'";
    }
}
