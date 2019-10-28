package marioprojekt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Acer
 */
public class Statistik {

    public static void lavStatistik(Bestilling bestilling) {
        File statistik = new File("src\\Data\\Statistik.txt");
        PrintWriter pw;

        try {
            pw = new PrintWriter(statistik);
            String tempBestilling;
            tempBestilling = bestilling.toString();
            pw.println(tempBestilling);
        } catch (IOException ex) {
            System.out.println("Unable to write file: " + statistik.toString());;
        }
    }
}
