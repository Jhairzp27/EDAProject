package Algoritmos;

public class RecetaConstr {
    private int id;
    private String nombre;

    public RecetaConstr(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
