package marioprojekt;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Acer
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

    public void fjernBestilling(Bestilling fjernBestilling) {
        bestillingsliste.remove(fjernBestilling);
    }

    public void visBestillingsliste() {
        String retVal = "";
        for (Bestilling best : bestillingsliste) {
            retVal += "Ordrenummer: " + best.getOrdrenummer() + " Afhentningstidspunkt: " + best.getAfhentningsTidspunkt() + "\n";
            for (Pizza pizza : best.getPizzaer()) {
                best.getPizzaer().toString();
            }

            // System.out.println(bestillingsliste.get(i).toString());
        }
    }
}
