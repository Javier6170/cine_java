/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Producto;
import modelo.ProductoComprados;
import modelo.Silla;

/**
 *
 * @author USUARIO
 */
public class VistaventaProductos extends javax.swing.JFrame {

    VistaOcupada vistaOcupada;
    private int fila;
    private int columna;
    private int numero;
    Silla[][] sillas;

    public VistaventaProductos(VistaOcupada vistaOcupada, int fila, int columna, int numero) {
        initComponents();
        this.vistaOcupada = vistaOcupada;
        setResizable(false);
        setLocationRelativeTo(null);
        this.fila = fila;
        this.columna = columna;
        this.numero = numero;
        sillas = new Silla[10][12];
        vistaOcupada.setEnabled(false);
        int tamaño = vistaOcupada.vistaPrincipal.controladorCRUDProductos.tamañoLista();
        for (int i = 0; i < tamaño; i++) {
            cmbElegirProductos.addItem(vistaOcupada.vistaPrincipal.controladorCRUDProductos.retornaProducto(i).getNombre());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtValorProductos = new javax.swing.JTextField();
        cmbElegirProductos = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtcantidadProductos = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtcantidadProductosDeseados = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cabecera 2 .jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6355.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 30, 330));

        btnComprar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 331, 260, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Valor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Productos");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 110, -1));

        txtNombreProducto.setEditable(false);
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 230, -1));

        txtValorProductos.setEditable(false);
        getContentPane().add(txtValorProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 230, -1));

        cmbElegirProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbElegirProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbElegirProductosItemStateChanged(evt);
            }
        });
        cmbElegirProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbElegirProductosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbElegirProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 230, -1));

        btnSalir.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnSalir.setText("REGRESAR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1852.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 320, 230));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nombre:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Elegir");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Cantidad de productos:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        txtcantidadProductos.setEditable(false);
        getContentPane().add(txtcantidadProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 80, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("¿Cantidad que deseas?");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        txtcantidadProductosDeseados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadProductosDeseadosActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidadProductosDeseados, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 260, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoProductos.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 740, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        txtNombreProducto.setEnabled(true);
        txtValorProductos.setEnabled(true);
        if (txtNombreProducto.getText().isEmpty() || txtValorProductos.getText().isEmpty() || txtcantidadProductos.getText().isEmpty() || txtcantidadProductosDeseados.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar y poner la cantidad que deseas");
        } else {
            int cantidadProductos = Integer.parseInt(txtcantidadProductos.getText());
            int cantidadProductosDeseados = Integer.parseInt(txtcantidadProductosDeseados.getText());
            int valor = Integer.parseInt(txtValorProductos.getText());

            if (cantidadProductos >= cantidadProductosDeseados) {

                int cuentaPersonal = vistaOcupada.vistaPrincipal.controladorCRUDCine.retornarPersona(fila, columna).getCuentaPersonal();

                int valorFinal = cantidadProductosDeseados * valor + cuentaPersonal;
                int CantidadFinal = cantidadProductos - cantidadProductosDeseados;
                
                String nombreProducto = String.valueOf(cmbElegirProductos.getSelectedItem());
                ProductoComprados productoComprados = new ProductoComprados(nombreProducto, valorFinal, CantidadFinal);
                vistaOcupada.vistaPrincipal.controladorCRUDCine.agregarProductosComprados(fila, columna, productoComprados);
                vistaOcupada.vistaPrincipal.controladorCRUDProductos.buscarPrducto(nombreProducto).setCantidad(CantidadFinal);
                vistaOcupada.vistaPrincipal.controladorCRUDCine.retornarPersona(fila, columna).setCantidadComprada(cantidadProductosDeseados + vistaOcupada.vistaPrincipal.controladorCRUDCine.retornarPersona(fila, columna).getCantidadComprada());
                vistaOcupada.vistaPrincipal.controladorCRUDCine.retornarPersona(fila, columna).setCuentaPersonal(valorFinal);
                vistaOcupada.vistaPrincipal.controladorCRUDCine.retornarPersona(fila, columna).setNombreProductoComprado(nombreProducto);
                JOptionPane.showMessageDialog(null, "Se ha agregado la compra correctamente " + valorFinal);
                vistaOcupada.setEnabled(true);
                vistaOcupada.buscarPersona();
                this.dispose();
            }
        }


    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vistaOcupada.setEnabled(true);
        vistaOcupada.buscarPersona();
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtcantidadProductosDeseadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadProductosDeseadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadProductosDeseadosActionPerformed

    private void cmbElegirProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbElegirProductosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbElegirProductosItemStateChanged

    private void cmbElegirProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElegirProductosActionPerformed
        String nombreProducto = String.valueOf(cmbElegirProductos.getSelectedItem());
        if (cmbElegirProductos.getSelectedItem().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un producto o todavia no hay productos");
        } else {
            String nombre = vistaOcupada.vistaPrincipal.controladorCRUDProductos.buscarPrducto(nombreProducto).getNombre();
            int valor = vistaOcupada.vistaPrincipal.controladorCRUDProductos.buscarPrducto(nombreProducto).getValor();
            int cantidad = vistaOcupada.vistaPrincipal.controladorCRUDProductos.buscarPrducto(nombreProducto).getCantidad();
            txtNombreProducto.setText(nombre);
            txtValorProductos.setText(String.valueOf(valor));
            txtcantidadProductos.setText(String.valueOf(cantidad));
        }
    }//GEN-LAST:event_cmbElegirProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbElegirProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtValorProductos;
    private javax.swing.JTextField txtcantidadProductos;
    private javax.swing.JTextField txtcantidadProductosDeseados;
    // End of variables declaration//GEN-END:variables
}
