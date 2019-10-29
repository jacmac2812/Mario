/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import marioprojekt.Bestilling;

/**
 *
 * @author jacobsimonsen
 */
public class FileFacade {
    
    File orderHistory = new File("Ordre Historik.txt");
    FileWriter fw;
    BufferedWriter bufWriter;
    FileReader fr;
    BufferedReader bufReader;

    public FileFacade() {

        try {
            fw = new FileWriter(orderHistory, true);
            bufWriter = new BufferedWriter(fw);
            fr = new FileReader(orderHistory);
            bufReader = new BufferedReader(fr);
        } catch (IOException ex) {
            Logger.getLogger(FileFacade.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void archiveOrder(Bestilling bestilling) {

        try {
            bufWriter.write(bestilling.toString());
            bufWriter.newLine();
            bufWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(FileFacade.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<String> readHistory() {
        ArrayList<String> history = new ArrayList();
        try {
            while (bufReader.ready()) {
                history.add(bufReader.readLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(FileFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return history;
    }

//Write a method to find the highest order number from the files
    public int readHighestOrderNo() {

        ArrayList<String> history = readHistory();
        ArrayList<Integer> orderNumbers = new ArrayList();
        int orderNo;
        int orderNumber;
        for (String str : history) {
            if (str.contains("OrdreNummer: ")) {
                String[] orderString;
                orderString = str.split(" ");
                orderNumber = Integer.parseInt(orderString[1]);
                orderNumbers.add(orderNumber);
            }
        }
        if (!orderNumbers.isEmpty()) {
            orderNo = (int) Collections.max(orderNumbers);
            orderNo++;
        } else {
            orderNo = 1;
        }
        return orderNo;
    }

    public String readStatistics() {
        return "Statistik ikke undersøttet i fil-modulet endnu";
    }
}
