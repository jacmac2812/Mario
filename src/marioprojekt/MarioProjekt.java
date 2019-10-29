
package marioprojekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MarioProjekt {

    public static void main(String[] args) {
        ArrayList<Pizza> menu = new ArrayList();
//       pizzaArray marioPizzaMenu = new pizzaArray("Marios Pizza");
//       indlæsMenukort(marioPizzaMenu);
       
       //Pizza pizza = new Pizza("Mafia","tomatsauce, ost, pepperoni, bacon, løg og oregano",61,14); 
       //Bestillingsliste tempListe = new Bestillingsliste(25.10);
       //tempListe.tilføjBestilling(new Bestilling(pizza, "20:45"));
       //tempListe.tilføjBestilling(new Bestilling(3, "17:39"));
       //tempListe.tilføjBestilling(new Bestilling(6, "22:00"));
       //tempListe.visBestillingsliste();
       UserInterface.userDialog(menu);
        
    }
    
//    public static pizzaArray indlæsMenukort(pizzaArray tempMenu) {
//        File menukort = new File("src\\Data\\Menukort.csv");
//        BufferedReader br; 
//        
//        try {
//            br = new BufferedReader(new FileReader(menukort));
//            String menuLine;
//            while ((menuLine = br.readLine()) != null) {
//                String[] data = menuLine.split(";");
//                tempMenu.tilføjPizza(new Pizza(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[0])));
//                }
//        } catch (FileNotFoundException ex) {
//            System.out.println("File not found: " + menukort.toString());
//        } catch (IOException ex) {
//            System.out.println("Unable to read file: " + menukort.toString());;
//        }
//        return tempMenu;
//    }
}
