
package Main;
import Controlers.DataBInit;
import Vista.Login;
import Vista.Splash;

/**
 *
 * @author jhair
 */
public class MainApp {
    public static void main(String[] args) throws Exception {
        DataBInit.initializeDataBase();
        Splash v1 = new Splash();
        v1.setVisible(true);
        
    }
}
