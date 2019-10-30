package marioprojekt;

/**
 *
 * @author jacobsimonsen & christianmadsen & jonasjørgensen
 */
public class MarioProjekt {

    public static void main(String[] args) {
        Menu menu = new Menu();
        UserInterface.userDialog(menu.getMenu());
    }
}
