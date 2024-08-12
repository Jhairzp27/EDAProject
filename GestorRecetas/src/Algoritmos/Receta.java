package Algoritmos;

public class Receta {
    private String nombre;
    private String ingredientes;
    private Integer cantidad;

    public Receta(String nombre, String ingredientes, Integer cantidad) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }
    
    public Integer getCantidad(){
        return cantidad;
    }


    @Override
    public String toString() {
        return nombre + ": " + ingredientes;
    }

    public void setIngredientes(String text) {
        this.ingredientes = text;
    }
}
