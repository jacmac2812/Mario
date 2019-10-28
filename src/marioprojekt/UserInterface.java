package marioprojekt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class UserInterface {

    public static void userDialog(pizzaArray tempMenu) {
        /*(Eksempel) Velkommen til computeren
        Hvordan ønsker du at forsætte?
        1 = opret (check)
        2 = fjern
        3 = se liste (check)
        4 = se menu (check)
        5 = se statistik
        0 = afslut program (check)
        Eventuel tilbage knap*/

        LocalDate date = LocalDate.now();

        int input;
        int ordrenummer = 1;
        Bestilling bestilling;
        Bestillingsliste bestillingsliste = new Bestillingsliste(date);
        Scanner myScan = new Scanner(System.in);
        Scanner myScan2 = new Scanner(System.in);
        Scanner myScan3 = new Scanner(System.in);

        System.out.println(startScreen());
        while (myScan.hasNextInt()) {
            input = myScan.nextInt();
            if (input == 1) {
                Pizza tempPizza;
                System.out.println("Opretter bestilling\nVælg afhentningstidspunkt:");
                String tempAT = myScan2.next();
                System.out.println("Vælg pizza:");
                while (myScan2.hasNextInt()) {
                    tempPizza = tempMenu.getPizza(myScan2.nextInt() - 1);
                    bestilling = new Bestilling(tempPizza, tempAT, ordrenummer);
                    bestillingsliste.tilføjBestilling(bestilling);
                    //Statistik.lavStatistik(bestilling);
                    System.out.println("Vælg ny pizza eller skriv nej for at afslutte bestilling");
                }
                ordrenummer++;
                System.out.println(startScreen());

            } else if (input == 2) {
                int ordreInput;
                System.out.println("Hvilken bestilling skal fjernes?\nSkriv ordrenummer:");
                ordreInput = myScan3.nextInt();
                for (int i = 1; i < bestillingsliste.getBestillingsliste().size(); i++) {
                    if (ordreInput == bestillingsliste.getBestillingsliste().get(i).getOrdrenummer()) {
                        bestillingsliste.fjernBestilling(bestillingsliste.getBestillingsliste().get(i));
                        System.out.println("Bestillingen: " + bestillingsliste.getBestillingsliste().get(i).getOrdrenummer() + " er fjernet");
                    } else {
                        System.out.println("Bestilling findes ikke");
                    }
                }    
                System.out.println(startScreen());

                }else if (input == 3) {
                bestillingsliste.visBestillingsliste();
                System.out.println(startScreen());

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
