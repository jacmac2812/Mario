package marioprojekt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class UserInterface {
    public static void userDialog(pizzaArray tempMenu) {
        /*sout Velkommen til computeren
        Hvordan ønsker du at forsætte?
        1 = opret
        2 = fjern
        3 = se liste
        4 = se menu (check)
        5 = se statistik
        0 = afslut program (check)
        Eventuel tilbage knap*/
        
        int input;
        int ordrenummer = 0;
        Scanner myScan = new Scanner(System.in);
        System.out.println(startScreen());
        while(myScan.hasNextInt()) {
            //System.out.println(startScreen());
            input = myScan.nextInt();
            if (input == 1) {
                System.out.println("Antal pizzaer:");
                int numOfPizza = Integer.parseInt(myScan.nextLine());
                String arrayOfPizza[] = new String[numOfPizza];
            } else if (input == 2) {
                
            } else if (input == 3) {
                
            } else if (input == 4) {
                tempMenu.pizza();
                System.out.println(startScreen());
            } else if (input == 5) {
                
            } else if (input == 0) {
                break;
            }
            
            
        }
    }
    
    public static String startScreen() {
        String diag = "";
        diag += "\nMarios Pizzabar\nHvordan ønsker du at fortsætte?\n";
        diag += "1: Opret ordre\n2: Fjern ordre\n3: Se liste med bestillinger\n";
        diag += "4: Se menukort\n5: Se statistik\n0: Afslut dag";
        return diag;
        }
    
}
