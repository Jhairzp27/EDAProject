package Algoritmos;

import java.util.Arrays;

public class ListaRecetas {
    private RecetaConstr[] datos;
    private int size;
    private static final int INICIAL_CAPACIDAD = 10;

    public ListaRecetas() {
        datos = new RecetaConstr[INICIAL_CAPACIDAD];
        size = 0;
    }

    public void add(RecetaConstr receta) {
        if (size == datos.length) {
            expandCapacity();
        }
        datos[size++] = receta;
    }

    public RecetaConstr get(int index) {
        if (index >= 0 && index < size) {
            return datos[index];
        }
        throw new IndexOutOfBoundsException("Índice fuera de rango.");
    }

    public int size() {
        return size;
    }

    private void expandCapacity() {
        int nuevaCapacidad = datos.length * 2;
        datos = Arrays.copyOf(datos, nuevaCapacidad);
    }

    public int busquedaSecuencial(String nombreBuscado) {
        for (int i = 0; i < size; i++) {
            if (datos[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                return i;
            }
        }
        return -1; // Indica que no se encontró
    }
}
