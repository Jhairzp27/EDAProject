package Algoritmos;

public class Nodo {
    private Receta receta;
    private Nodo siguiente;

    public Nodo(Receta receta) {
        this.receta = receta;
        this.siguiente = null;
    }

    public Receta getReceta() {
        return receta;
    }
    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
}
