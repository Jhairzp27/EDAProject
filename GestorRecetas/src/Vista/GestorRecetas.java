/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Algoritmos.ListaSimple;
import Algoritmos.Nodo;
import Algoritmos.Receta;

/**
 *
 * @author adict
 */
public class GestorRecetas extends javax.swing.JFrame {

    /**
     * Creates new form Receta
     */
    private ListaSimple listaRecetas;
    private Receta receta;
    
    public GestorRecetas() {
        initComponents();
        this.setLocationRelativeTo(null);
        listaRecetas = new ListaSimple();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        botonIngresar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botonOrdenar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        FondoRecetas = new javax.swing.JLabel();
        botonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Ingredientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 150, -1));

        botonIngresar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        botonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Agregar.png"))); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        botonMostrar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        botonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/book-marked-fill.png"))); // NOI18N
        botonMostrar.setText("Mostrar");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        botonBuscar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/seleccionar.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Ingredientes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 350));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        botonOrdenar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        botonOrdenar.setText("Ordenar");
        botonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(botonOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 90, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/home.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        FondoRecetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/recetas.jpg"))); // NOI18N
        FondoRecetas.setText("jLabel3");
        getContentPane().add(FondoRecetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cargarRecetasEnTabla() {
        String[][] datos = obtenerDatosRecetas();
        String[] columnas = {"Nombre", "Ingredientes"};
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(datos, columnas);
        jTable1.setModel(model);
    }
    private String[][] obtenerDatosRecetas() {
        int cantidadRecetas = listaRecetas.contarRecetas();
        String[][] datos = new String[cantidadRecetas][2];

        Nodo temp = listaRecetas.getCabeza();
        int i = 0;
        while (temp != null) {
            datos[i][0] = temp.getReceta().getNombre();
            datos[i][1] = temp.getReceta().getIngredientes();
            temp = temp.getSiguiente();
            i++;
        }
        return datos;
    }
    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        // Obtiene los valores de los campos de texto
    String nombre = jTextField1.getText();
    String ingredientes = jTextArea1.getText();

    // Crea una nueva receta y la agrega a la lista
    Algoritmos.Receta nuevaReceta = new Algoritmos.Receta(nombre, ingredientes);
    listaRecetas.agregarReceta(nuevaReceta);

    // Muestra un mensaje de confirmación
    javax.swing.JOptionPane.showMessageDialog(this, "Receta guardada con éxito");

    // Limpia los campos de texto
    jTextField1.setText("");
    jTextArea1.setText("");

    // Actualiza la tabla para mostrar la nueva receta
    cargarRecetasEnTabla();
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String nombre = jTextField1.getText();
     receta = listaRecetas.buscarReceta(nombre);  // Asigna la receta encontrada a la variable 'receta'

     if (receta != null) {
         jTextField1.setText(receta.getNombre());
         jTextArea1.setText(receta.getIngredientes());
     } else {
         javax.swing.JOptionPane.showMessageDialog(this, "Receta no encontrada");
         jTextField1.setText("");
         jTextArea1.setText("");
     }
     
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        // Carga las recetas en la tabla
        cargarRecetasEnTabla();
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarActionPerformed
        listaRecetas.ordenarRecetasPorNombre();
        // Actualiza la tabla después de ordenar
        cargarRecetasEnTabla();
    }//GEN-LAST:event_botonOrdenarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (receta != null) {
        receta.setIngredientes(jTextArea1.getText());
        javax.swing.JOptionPane.showMessageDialog(this, "Ingredientes actualizados con éxito");
        cargarRecetasEnTabla();  // Actualiza la tabla para reflejar los cambios
        } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Primero busque una receta para modificar");
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorRecetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorRecetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorRecetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorRecetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorRecetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoRecetas;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonOrdenar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
