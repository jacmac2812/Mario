/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.mycompany.controller.Order;
import java.util.ArrayList;

/**
 *
 * @author jonassimonsen
 */
public interface Facade {

    public void archiveOrder(Order order);

    ArrayList<String> readHistory();

    public int readHighestOrderNo();

    public String readStatistics();
}