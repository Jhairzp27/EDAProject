
package Main;
import Controlers.DataBInit;
import Vista.Login;

/**
 *
 * @author jhair
 */
public class MainApp {
    public static void main(String[] args) throws Exception {
        DataBInit.initializeDataBase();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        
    }
}
