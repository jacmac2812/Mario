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
    
    public void tilføjBestilling(Bestilling nyBestilling) {
        bestillingsliste.add(nyBestilling);
    }
    
    public void fjernBestilling(Bestilling fjernBestilling) {
        bestillingsliste.remove(fjernBestilling);
    }
    
    public void visBestillingsliste() {
        for (int i = 0; i < bestillingsliste.size(); i++) {
            System.out.println(bestillingsliste.get(i).toString());
        }
    }
}
