package marioprojekt;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author christianmadsen & jacobsimonsen % jonasjørgensen
 */
public class Bestillingsliste {

    private LocalDate date;
    private ArrayList<Bestilling> bestillingsliste;

    public Bestillingsliste(LocalDate date) {
        bestillingsliste = new ArrayList<>();
        this.date = date;
    }

    public ArrayList<Bestilling> getBestillingsliste() {
        return bestillingsliste;
    }

    public void setBestillingsliste(ArrayList<Bestilling> bestillingsliste) {
        this.bestillingsliste = bestillingsliste;
    }

    public void tilføjBestilling(Bestilling nyBestilling) {
        bestillingsliste.add(nyBestilling);
    }

    public String fjernBestilling(int ordreNummer) {
        for (Bestilling bestilling : bestillingsliste) {
            if (ordreNummer == bestilling.getOrdrenummer()) {
                bestillingsliste.remove(bestilling);
                System.out.println("Ordrenummer: " + ordreNummer + " er fjernet fra listen");
                return "Ordrenummer: " + ordreNummer + " er fjernet fra listen"; 
            } else {
                System.out.println("Bestillingen findes ikke");
                return "Bestillingen findes ikke";
            }
        }
        return "";
    }

    public void visBestillingsliste() {
        String retVal = "";

        for (Bestilling best : bestillingsliste) {
            retVal += best.toString() + "\n";
        }
        System.out.print(retVal);
    }
}
