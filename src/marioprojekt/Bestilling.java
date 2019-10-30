package marioprojekt;

import java.util.ArrayList;

/**
 *
 * @author Acer & jacobsimonsen
 */
public class Bestilling {
    private String afhentningsTidspunkt;
    private ArrayList<Pizza> pizzaer;
    private int ordrenummer;
    
    public Bestilling(ArrayList<Pizza> pizzaer, int ordrenummer, String afhentningsTidspunkt ) {
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
    public void addPizza(Pizza pizza){
        pizzaer.add(pizza);
    }
      
    @Override
    public String toString() {
        String result = "Ordrenummer: " + getOrdrenummer() + "   Afhentnings tidspunkt: " + getAfhentningsTidspunkt() + "\n"; 
        for (Pizza pizza : pizzaer) {
            result += pizza.toString()+ "\n";
        }
       return  result;
   }
    

//    public Pizza getPizza() {
//        return pizza;
//    }

    
    
    
}
