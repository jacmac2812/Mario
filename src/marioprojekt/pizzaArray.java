
package marioprojekt;

import java.util.ArrayList;

public class pizzaArray {

    private ArrayList<Pizza> pizzaMenu;

    private String navn;

    public pizzaArray(String navn) {
        pizzaMenu = new ArrayList<>();
        this.navn = navn;
    }

    public void tilføjPizza(Pizza nyPizza) {
        pizzaMenu.add(nyPizza);
    }
    
    public Pizza getPizza (int i) {
        return pizzaMenu.get(i);
    }

    public void pizza() {
        for (int i = 0; i < pizzaMenu.size(); i++) {
            System.out.println(pizzaMenu.get(i).toString());

        }
    }
}
