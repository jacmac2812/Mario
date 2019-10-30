/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marioprojekt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class PizzaTest {

    /**
     * Test of getNavn method, of class Pizza.
     */
    @Test
    public void testGetNavn() {
        System.out.println("getNavn");
        Pizza instance = new Pizza(1, "Amerikaner", 65, "ost og skinke");
        String expResult = "Amerikaner";
        String result = instance.getNavn();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNavn method, of class Pizza.
     */
    @Test
    public void testSetNavn() {
        System.out.println("setNavn");
        String navn = "Amerikaner";
        Pizza instance = new Pizza(1, "Hawaii", 65, "ost og skinke");
        instance.setNavn(navn);

    }

    /**
     * Test of getIndhold method, of class Pizza.
     */
    @Test
    public void testGetIndhold() {
        System.out.println("getIndhold");
        Pizza instance = new Pizza(1, "Amerikaner", 65, "ost og skinke");
        String expResult = "ost og skinke";
        String result = instance.getIndhold();
        assertEquals(expResult, result);

    }

}
