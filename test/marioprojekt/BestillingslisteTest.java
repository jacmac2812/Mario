/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marioprojekt;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class BestillingslisteTest {

    /**
     * Test of fjernBestilling method, of class Bestillingsliste.
     */
    @Test
    public void testFjernBestilling() {
        //arrange
        int orderNumberToRemove = 1;
        Bestillingsliste bestillingsliste = new Bestillingsliste(LocalDate.MAX);
        ArrayList<Pizza> pizzaer = new ArrayList();
        Bestilling bestilling = new Bestilling(pizzaer, orderNumberToRemove, "15:30");
        bestillingsliste.tilføjBestilling(bestilling);

        //act
        String result = bestillingsliste.fjernBestilling(orderNumberToRemove);

        //assert
        String expectedReturn = "Ordrenummer: " + orderNumberToRemove + " er fjernet fra listen";
        int expectedSize = 0;
        assertTrue(result.equals(expectedReturn));
        assertEquals(expectedSize, bestillingsliste.getBestillingsliste().size());
    }

}
