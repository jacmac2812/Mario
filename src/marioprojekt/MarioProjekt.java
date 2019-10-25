
package marioprojekt;

public class MarioProjekt {

    public static void main(String[] args) {
       /*pizzaArray marioPIzzaMenu = new pizzaArray("Mario'sPizza");

        //marioPIzzaMenu.tilføjPizza(new Pizza("navn","indhold",pris,nummer));
        marioPIzzaMenu.tilføjPizza(new Pizza("Vesuvio","tomatsauce, ost, skinke og oregano",57,1));
        marioPIzzaMenu.tilføjPizza(new Pizza("Amerikaner","tomatsauce, ost, oksefars og oregano",53,2));
        marioPIzzaMenu.tilføjPizza(new Pizza("Cacciatore","tomatsauce, ost, pepperoni og oregano",57,3));
        marioPIzzaMenu.tilføjPizza(new Pizza("Carbona","tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano",63,4));
        marioPIzzaMenu.tilføjPizza(new Pizza("Dennis","tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano",65,5));
        marioPIzzaMenu.tilføjPizza(new Pizza("Bertil","tomatsauce, ost, bacon og oregano",57,6));
        marioPIzzaMenu.tilføjPizza(new Pizza("Silvia","tomatsauce, ost, pepperoni, rd peber, løg og oregano",61,7));
        marioPIzzaMenu.tilføjPizza(new Pizza("Victoria","tomatsauce, ost, ananas, champignon, løg og oregano",61,8));
        marioPIzzaMenu.tilføjPizza(new Pizza("Toronfo","tomatsauce, ost, skinke, bacon, kebab, chili og oregano",61,9));
        marioPIzzaMenu.tilføjPizza(new Pizza("Caprocciosa","tomatsauce, ost, skinke, champignon og oregano",61,10));
        marioPIzzaMenu.tilføjPizza(new Pizza("Haawai","tomatsauce, ost, skinke, ananas og oregano",61,11));
        marioPIzzaMenu.tilføjPizza(new Pizza("Blissola","tomatsauce, ost, skinke, rejer og oregano",61,12));
        marioPIzzaMenu.tilføjPizza(new Pizza("Venezia","tomatsauce, ost, skinke, bacon og oregano",61,13));
        marioPIzzaMenu.tilføjPizza(new Pizza("Mafia","tomatsauce, ost, pepperoni, bacon, løg og oregano",61,14));
       
        marioPIzzaMenu.pizza(); */
       Pizza pizza = new Pizza("Mafia","tomatsauce, ost, pepperoni, bacon, løg og oregano",61,14); 
       Bestillingsliste tempListe = new Bestillingsliste(25.10);
       tempListe.tilføjBestilling(new Bestilling(pizza, "20:45"));
       //tempListe.tilføjBestilling(new Bestilling(3, "17:39"));
       //tempListe.tilføjBestilling(new Bestilling(6, "22:00"));
       tempListe.visBestillingsliste();
       UserInterface.userDialog();
        
    }
}
