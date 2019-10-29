package marioprojekt;

import Data.FileFacade;

public class MarioProjekt {

    public static void main(String[] args) {
        Menu menu = new Menu();
        FileFacade file = new FileFacade();
        UserInterface.userDialog(menu.getMenu());
    }

//    public static pizzaArray indlæsMenukort(pizzaArray tempMenu) {
//        File menukort = new File("src\\Data\\Menukort.csv");
//        BufferedReader br; 
//        
//        try {
//            br = new BufferedReader(new FileReader(menukort));
//            String menuLine;
//            while ((menuLine = br.readLine()) != null) {
//                String[] data = menuLine.split(";");
//                tempMenu.tilføjPizza(new Pizza(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[0])));
//                }
//        } catch (FileNotFoundException ex) {
//            System.out.println("File not found: " + menukort.toString());
//        } catch (IOException ex) {
//            System.out.println("Unable to read file: " + menukort.toString());;
//        }
//        return tempMenu;
//    }
}
