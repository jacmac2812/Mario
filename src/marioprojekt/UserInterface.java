package marioprojekt;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class UserInterface {
    public static void userDialog() {
        /*sout Velkommen til computeren
        Hvordan ønsker du at forsætte?
        1 = tilføj
        2 = fjern
        3 = se liste
        4 = se menu
        5 = se statistik
        0 = afslut program
        Eventuel tilbage knap*/
        
        int input;
        Scanner myScan = new Scanner(System.in);
        System.out.println(startScreen());
        while(myScan.hasNextInt()) {
            System.out.println(startScreen());
            input = myScan.nextInt();
            if (input == 1) {
                
            }
            
            
        }
    }
    
    public static String startScreen() {
        String diag = "";
        diag += "Marios Pizzabar\nHvordan ønsker du at fortsætte?\n";
        diag += "1: Opret ordre\n2: Fjern ordre\n3: Se liste med bestillinger\n";
        diag += "4: Se menukort\n5: Se statistik\n0: Afslut dag";
        return diag;
        }
    
}
