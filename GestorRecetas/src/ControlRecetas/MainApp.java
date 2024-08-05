
package ControlRecetas;
import Vista.Login;
import Vista.HomePage;

/**
 *
 * @author jhair
 */
public class MainApp {
    public static void main(String[] args) {
        HomePage home = new HomePage();
        home.setVisible(true);
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        
    }
}
