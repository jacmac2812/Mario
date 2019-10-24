package marioprojekt;

import java.util.ArrayList;

public class Pizza {

    String navn;
    String indhold;
    int pris;
    int nummer;

    public Pizza(String navn, String indhold, int pris, int nummer) {
        this.navn = navn;
        this.indhold = indhold;
        this.pris = pris;
        this.nummer = nummer;
    }
    

    /*public Pizza() {
        
    ArrayList pizzaMenu = new Arraylist();
    pizzaMenu.add("Vesuvio: tomatsauce, ost, skinke og oregano");
    pizzaMenu.add("Amerikaner: tomatsauce, ost, oksefars og oregano");
    pizzaMenu.add("Cacciatore: tomatsauce, ost, pepperoni og oregano");
    pizzaMenu.add("Carbona: tomatsauce, ost, k¯dsauce, spaghetti, cocktailp¯lser og oregano");
    pizzaMenu.add("Dennis: tomatsauce, ost, skinke, pepperoni, cocktailp¯lser og oregano");
    pizzaMenu.add("Bertil: tomatsauce, ost, bacon og oregano");
    pizzaMenu.add("Silvia: tomatsauce, ost, pepperoni, r¯d peber, l¯g og oregano");
    pizzaMenu.add("Victoria: tomatsauce, ost, ananas, champignon, l¯g og oregano");
    pizzaMenu.add("Toronfo: tomatsauce, ost, skinke, bacon, kebab, chili og oregano");
    pizzaMenu.add("Caprocciosa: tomatsauce, ost, skinke, champignon og oregano");
    pizzaMenu.add("Haawai: tomatsauce, ost, skinke, ananas og oregano");
    pizzaMenu.add("Le Blissola: tomatsauce, ost, skinke, rejer og oregano");
    pizzaMenu.add("Venezia: tomatsauce, ost, skinke, bacon og oregano");
    pizzaMenu.add("Mafia: tomatsauce, ost, pepperoni, bacon, l¯g og oregano");
 
    }
     */
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getIndhold() {
        return indhold;
    }

    public void setIndhold(String indhold) {
        this.indhold = indhold;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String toString() {
        return String.format("%d. %s: %s %d kr", nummer,navn,indhold,pris);
    }
}
