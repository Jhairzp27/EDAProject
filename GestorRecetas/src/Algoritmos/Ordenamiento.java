package Algoritmos;

import java.util.List;

public class Ordenamiento {

    // Ordenamiento burbuja para ordenar recetas por nombre (alfabéticamente)
    public static void ordenamientoBurbuja(List<String> lista) {
        int N = lista.size();
        boolean swapped;
        
        for (int i = 0; i < N - 1; i++) {
            swapped = false;
            for (int j = 0; j < N - 1 - i; j++) {
                if (lista.get(j).compareToIgnoreCase(lista.get(j + 1)) > 0) {
                    // Intercambiar
                    String temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                    swapped = true;
                }
            }
            // Si no hubo intercambios, la lista ya está ordenada
            if (!swapped) break;
        }
    }
}
