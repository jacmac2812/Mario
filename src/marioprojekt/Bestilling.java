package marioprojekt;

/**
 *
 * @author Acer
 */
public class Bestilling {
    private String afhentningsTidspunkt;
    private Pizza pizza;
    
    public Bestilling(Pizza pizza, String afhentningsTidspunkt) {
        this.pizza = pizza;
        this.afhentningsTidspunkt = afhentningsTidspunkt;
    }

    public String getAfhentningsTidspunkt() {
        return afhentningsTidspunkt;
    }

    public void setAfhentningsTidspunkt(String afhentningsTidspunkt) {
        this.afhentningsTidspunkt = afhentningsTidspunkt;
    }

    @Override
    public String toString() {
        return pizza.toString() + "\nAfhentnings tidspunkt: " + getAfhentningsTidspunkt();
    }
    
    
    
}
