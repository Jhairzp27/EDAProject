package Algoritmos;

import javax.swing.JOptionPane;

public class ColaCircular {
    private Pedido[] cola;
    private int frente;
    private int fin;
    private int tamaño;

    public ColaCircular(int capacidad) {
        cola = new Pedido[capacidad];
        frente = -1;
        fin = -1;
        tamaño = capacidad;
    }

    public boolean estaLlena() {
        return (frente == 0 && fin == tamaño - 1) || (fin + 1 == frente);
    }

    public boolean estaVacia() {
        return frente == -1;
    }

    public void agregarPedido(Pedido pedido) {
        if (estaLlena()) {
            JOptionPane.showMessageDialog(null, "La cola está llena, no se puede agregar el pedido.");       
            return;
        }

        if (frente == -1) {
            frente = 0;
        }

        fin = (fin + 1) % tamaño;
        cola[fin] = pedido;
    }

    public Pedido procesarPedido() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La cola está vacía, no hay pedidos para procesar.");
            return null;
        }

        Pedido pedidoProcesado = cola[frente];

        if (frente == fin) {
            frente = -1;
            fin = -1;
        } else {
            frente = (frente + 1) % tamaño;
        }

        return pedidoProcesado;
    }

    public Pedido[] getPedidos() {
        Pedido[] pedidosActuales = new Pedido[tamaño];
        if (estaVacia()) {
            return pedidosActuales;
        }

        int i = frente;
        int index = 0;
        while (true) {
            pedidosActuales[index++] = cola[i];
            if (i == fin) {
                break;
            }
            i = (i + 1) % tamaño;
        }

        return pedidosActuales;
    }

    public String mostrarPedidos() {
        if (estaVacia()) {
            return "No hay pedidos en la cola.";
        }

        StringBuilder sb = new StringBuilder();
        int i = frente;
        while (true) {
            sb.append(cola[i].toString()).append("\n");
            if (i == fin) {
                break;
            }
            i = (i + 1) % tamaño;
        }

        return sb.toString();
    }
}
