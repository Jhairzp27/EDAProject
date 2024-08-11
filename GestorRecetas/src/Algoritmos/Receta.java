package Algoritmos;

public class Receta {
    private String nombre;
    private String ingredientes;

    public Receta(String nombre, String ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }


    @Override
    public String toString() {
        return nombre + ": " + ingredientes;
    }

    public void setIngredientes(String text) {
        this.ingredientes = text;
    }
}
