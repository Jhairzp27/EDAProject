package Algoritmos;

import javax.swing.JOptionPane;
import java.util.List;

public class Busqueda {

    // Búsqueda secuencial en una lista desordenada
    public static int busquedaSecuencialDesordenada(List<String> lista, String dato) {
        int i = 0;
        int N = lista.size();
        
        while (i < N && !lista.get(i).equalsIgnoreCase(dato)) {
            i++;
        }

        if (i >= N) {
            JOptionPane.showMessageDialog(null, "La receta no se encuentra en la lista");
            return -1;
        } else {
            JOptionPane.showMessageDialog(null, "La receta fue encontrada en la posición: " + i);
            return i;
        }
    }

    // Búsqueda secuencial en una lista ordenada
    public static int busquedaSecuencialOrdenada(List<String> lista, String dato) {
        int i = 0;
        int N = lista.size();
        
        while (i < N && lista.get(i).compareToIgnoreCase(dato) < 0) {
            i++;
        }

        if (i < N && lista.get(i).equalsIgnoreCase(dato)) {
            JOptionPane.showMessageDialog(null, "La receta fue encontrada en la posición: " + i);
            return i;
        } else {
            JOptionPane.showMessageDialog(null, "La receta no se encuentra en la lista");
            return -1;
        }
    }
}
