package marioprojekt;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Bestilling {
    private String afhentningsTidspunkt;
    private ArrayList<Pizza> pizzaer;
    private int ordrenummer;
    
    public Bestilling(ArrayList<Pizza> pizzaer, String afhentningsTidspunkt, int ordrenummer) {
        this.pizzaer = new ArrayList<>();
        this.afhentningsTidspunkt = afhentningsTidspunkt;
        this.ordrenummer = ordrenummer;
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
//      
//    @Override
//    public String toString() {
//        return "Ordrenummer: " + getOrdrenummer() + "   Afhentnings tidspunkt: " + getAfhentningsTidspunkt() + "\n" + pizza.toString();
//    }
//    

    
    
    
}
