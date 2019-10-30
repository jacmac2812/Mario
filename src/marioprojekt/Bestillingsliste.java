package marioprojekt;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Acer & jacobsimonsen
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

    public void fjernBestilling(int ordreNummer) {
        //bestillingsliste.remove(bestilling);
        for (Bestilling bestilling : bestillingsliste) {
            if (ordreNummer == bestilling.getOrdrenummer()) {
                bestillingsliste.remove(bestilling);
                break;
            }
        }
    }

    public void visBestillingsliste() {
        String retVal = "";
        
        for (Bestilling best : bestillingsliste) {
            retVal += best.toString() + "\n";
        }
        System.out.print(retVal);
    }
}
