package Algoritmos;

public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }
    
      // Método para buscar una receta por su nombre
    public Receta buscarReceta(String nombre) {
    Nodo temp = cabeza;
    while (temp != null) {
        if (temp.getReceta().getNombre().equalsIgnoreCase(nombre)) {
            //javax.swing.JOptionPane.showMessageDialog(null, "Receta encontrada en la lista");
            return temp.getReceta();
        }
        temp = temp.getSiguiente();
    }
    //javax.swing.JOptionPane.showMessageDialog(null, "Receta no encontrada");
    return null;
}

    // Método para agregar una receta a la lista
    public void agregarReceta(Receta receta) {
        Nodo nuevoNodo = new Nodo(receta);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Método para contar las recetas en la lista
    public int contarRecetas() {
        int contador = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            contador++;
            temp = temp.getSiguiente();
        }
        return contador;
    }

    // Método para obtener el nodo cabeza (para iterar sobre la lista)
    public Nodo getCabeza() {
        return cabeza;
    }

    // Método para obtener la lista de recetas en formato String
    public String obtenerListaRecetas() {
        StringBuilder lista = new StringBuilder();
        Nodo temp = cabeza;
        while (temp != null) {
            lista.append(temp.getReceta().toString()).append("\n");
            temp = temp.getSiguiente();
        }
        return lista.toString();
    }

    // Método para ordenar la lista de recetas alfabéticamente por nombre
    public void ordenarRecetasPorNombre() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return; // Lista vacía o con un solo elemento
        }

        boolean cambiado;
        do {
            cambiado = false;
            Nodo actual = cabeza;

            while (actual.getSiguiente() != null) {
                Nodo siguiente = actual.getSiguiente();

                if (actual.getReceta().getNombre().compareToIgnoreCase(siguiente.getReceta().getNombre()) > 0) {
                    // Intercambiar recetas entre nodos
                    Receta tempReceta = actual.getReceta();
                    actual.setReceta(siguiente.getReceta());
                    siguiente.setReceta(tempReceta);
                    cambiado = true;
                }

                actual = siguiente;
            }
        } while (cambiado);
    }
}
