/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import com.mycompany.controller.Order;
import com.mycompany.controller.Pizza;
import java.util.ArrayList;

/**
 *
 * @author jonassimonsen
 */
public interface UI {
    
    public int selectPizza();

    public void showPizzaSelection(String str);

    public void displayOrderNumber(int ordreNummer);

    public void displayMenu(ArrayList<Pizza> menukort);

    public void displayMainMenu();

    public String mainMenuSelection();

    public void displayHistory(ArrayList<String> læsHistorik);

    public int selectOrder();

    public void pressAnyKey();

    public void displayOrders(Order bestilling);

    public int selectPizzaAmount();

    public Boolean selectMorePizza();

    public void showPizzaListSelection(ArrayList<Pizza> pizzaList);

    public void cancelOrderMsg(Order order);

    public void showStatistics(String readStatistics);
}
