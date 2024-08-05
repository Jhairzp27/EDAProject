package ControlRecetas.DataControl;

public class NewExceptio extends Exception {

    public NewExceptio(String e, String clase, String metodo) {
        System.out.println("[ERROR EN Recetario para el log] " + clase + "." + metodo + " : " + e);
    }

}
