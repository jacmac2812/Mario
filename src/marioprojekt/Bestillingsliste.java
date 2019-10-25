package marioprojekt;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Bestillingsliste {
    private double dato;
    private ArrayList<Bestilling> bestillingsliste;
    
    public Bestillingsliste(double dato) {
        bestillingsliste = new ArrayList<>();
        this.dato = dato;
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
