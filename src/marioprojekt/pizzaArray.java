
package marioprojekt;

import java.util.ArrayList;

public class pizzaArray {

    private ArrayList<Pizza> pizzaMenu;

    private String pizza;

    public pizzaArray(String pizza) {
        pizzaMenu = new ArrayList<>();
        this.pizza = pizza;
    }

    public void tilføjPizza(Pizza nyPizza) {
        pizzaMenu.add(nyPizza);
    }

    public void pizza() {
        for (int i = 0; i < pizzaMenu.size(); i++) {
            System.out.println(pizzaMenu.get(i).toString());

        }
    }
}
