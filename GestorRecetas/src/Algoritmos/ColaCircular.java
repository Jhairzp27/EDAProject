package Algoritmos;

import javax.swing.JOptionPane;

public class ColaCircular {

    private Pedido[] cola;
    private int frente = -1;
    private int fin = -1;

    public ColaCircular(int dimension) {
        this.cola = new Pedido[dimension];
    }

    public void agregarPedido(Pedido pedido) {
        if ((this.frente == 0 && this.fin + 1 == this.cola.length) || (this.fin + 1 == this.frente)) {
            JOptionPane.showMessageDialog(null, "Cola llena\nNo se pueden agregar más pedidos.");
        } else {
            if (this.frente == -1) {
                this.fin = 0;
                this.frente = 0;
            } else if (this.fin + 1 == this.cola.length) {
                this.fin = 0;
            } else {
                this.fin++;
            }
            this.cola[this.fin] = pedido;
        }
    }

    public Pedido procesarPedido() {
        if (this.frente == -1) {
            JOptionPane.showMessageDialog(null, "Cola vacía\nNo hay pedidos pendientes.");
            return null;
        } else {
            Pedido pedidoProcesado = this.cola[this.frente];
            if (this.frente == this.fin) {
                this.frente = -1;
                this.fin = -1;
            } else if (this.frente + 1 == this.cola.length) {
                this.frente = 0;
            } else {
                this.frente++;
            }
            return pedidoProcesado;
        }
    }

    public String mostrarPedidos() {
        StringBuilder salida = new StringBuilder();
        if (frente == -1) {
            salida.append("No hay pedidos pendientes.");
        } else {
            int i = frente;
            while (true) {
                salida.append(this.cola[i].toString()).append("\n");
                if (i == fin) break;
                i = (i + 1) % this.cola.length;
            }
        }
        return salida.toString();
    }
}
