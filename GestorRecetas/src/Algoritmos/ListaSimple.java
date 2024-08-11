package Algoritmos;

public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
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

    // Método para eliminar una receta de la lista por su nombre
    public void eliminarReceta(String nombre) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.getReceta().getNombre().equalsIgnoreCase(nombre)) {
            cabeza = cabeza.getSiguiente();
            return;
        }
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getReceta().getNombre().equalsIgnoreCase(nombre)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return;
            }
            actual = actual.getSiguiente();
        }
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

    // Método para buscar una receta por su nombre
    public Receta buscarReceta(String nombre) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getReceta().getNombre().equalsIgnoreCase(nombre)) {
                return temp.getReceta();
            }
            temp = temp.getSiguiente();
        }
        return null; // Retorna null si no se encuentra la receta
    }

    // Método para ordenar la lista de recetas por nombre usando Bubble Sort
    public void ordenarRecetasPorNombre() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return; // La lista está vacía o tiene un solo elemento
        }
        boolean huboCambio;
        do {
            Nodo actual = cabeza;
            Nodo siguiente = cabeza.getSiguiente();
            Nodo anterior = null;
            huboCambio = false;
            while (siguiente != null) {
                if (actual.getReceta().getNombre().compareToIgnoreCase(siguiente.getReceta().getNombre()) > 0) {
                    huboCambio = true;
                    // Intercambia los nodos actual y siguiente
                    if (anterior == null) {
                        cabeza = siguiente;
                    } else {
                        anterior.setSiguiente(siguiente);
                    }
                    actual.setSiguiente(siguiente.getSiguiente());
                    siguiente.setSiguiente(actual);
                    anterior = siguiente;
                    siguiente = actual.getSiguiente();
                } else {
                    anterior = actual;
                    actual = siguiente;
                    siguiente = siguiente.getSiguiente();
                }
            }
        } while (huboCambio);
    }
}