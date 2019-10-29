/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mycompany.controller.Controller;
import com.mycompany.controller.Menu;
import data.Facade;
import data.FileFacade;
import presentation.SystemUI;
import presentation.UI;

/**
 *
 * @author jonassimonsen
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Mario Pizza");
        
        Menu menu = new Menu();
        UI ui = new SystemUI();
        Facade facade = new FileFacade();

        Controller ctrl = new Controller(ui, menu.getMenu(), facade);
        ctrl.start();
    }
}
