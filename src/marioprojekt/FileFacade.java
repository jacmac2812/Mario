package marioprojekt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import marioprojekt.Bestilling;

/**
 *
 * @author jacobsimonsen
 */
public class FileFacade {

    File orderHistory = new File("src\\Data\\Ordre Historik.txt");
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

    public void arraySplit() {
        for (String string : readHistory()) {
            System.out.println(string);
        }
    }

}
