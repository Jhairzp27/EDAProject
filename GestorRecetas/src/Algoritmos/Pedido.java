package Algoritmos;

public class Pedido {
    private String nombreCliente;
    private String descripcion;

    public Pedido(String nombreCliente, String descripcion) {
        this.nombreCliente = nombreCliente;
        this.descripcion = descripcion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCliente + ", Pedido: " + descripcion;
    }
}
