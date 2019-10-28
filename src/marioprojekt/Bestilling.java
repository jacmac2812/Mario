package marioprojekt;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Bestilling {
    private String afhentningsTidspunkt;
    private Pizza pizza;
    private int ordrenummer;
    
    public Bestilling(Pizza pizza, String afhentningsTidspunkt, int ordrenummer) {
        this.pizza = pizza;
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
    
    @Override
    public String toString() {
        return "Ordrenummer: " + getOrdrenummer() + "   Afhentnings tidspunkt: " + getAfhentningsTidspunkt() + "\n" + pizza.toString();
    }
    
    public String toStringPizza() {
        return pizza.toString();
    } 
    
    
    
}
