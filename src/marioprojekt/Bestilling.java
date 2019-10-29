package marioprojekt;

import java.util.ArrayList;

/**
 *
 * @author Acer & jacobsimonsen
 */
public class Bestilling {
    private String afhentningsTidspunkt;
    private ArrayList<Pizza> pizzaer;
    private Pizza pizza;
    private int ordrenummer;
    
    public Bestilling(ArrayList<Pizza> menu, Pizza pizza, int ordrenummer, String afhentningsTidspunkt ) {
        this.pizzaer = new ArrayList<>();
        this.ordrenummer = ordrenummer;
        this.afhentningsTidspunkt = afhentningsTidspunkt;
    }

    public String getAfhentningsTidspunkt() {
        return afhentningsTidspunkt;
    }

    public void setAfhentningsTidspunkt(String afhentningsTidspunkt) {
        this.afhentningsTidspunkt = afhentningsTidspunkt;
    }

    public int getOrdrenummer() {
        return ordrenummer;
    }

    public void setOrdrenummer(int ordrenummer) {
        this.ordrenummer = ordrenummer;
    }

    public ArrayList<Pizza> getPizzaer() {
        return pizzaer;
    }
      
    @Override
    public String toString() {
       return "Ordrenummer: " + getOrdrenummer() + "   Afhentnings tidspunkt: " + getAfhentningsTidspunkt() + "\n" + pizza.toString() + "\n";
   }
    

    public Pizza getPizza() {
        return pizza;
    }

    
    
    
}
