/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Exceptions.ProductoYaExisteException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.Silla;

/**
 *
 * @author USUARIO
 */
public class VistaEleccionProductos extends javax.swing.JFrame {

    VistaPrincipal vistaPrincipal;

    public VistaEleccionProductos(VistaPrincipal vistaPrincipal) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setEnabled(false);

        int tamaño = vistaPrincipal.controladorCRUDProductos.tamañoLista();
        for (int i = 0; i < tamaño; i++) {
            cmbElegirProductos.addItem(vistaPrincipal.controladorCRUDProductos.retornaProducto(i).getNombre());
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
        btnAgregarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcantidadProductos = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtValorProductos = new javax.swing.JTextField();
        cmbElegirProductos = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cabecera 2 .jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

        btnAgregarProducto.setText("Agregar producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 240, -1));

        btnEliminarProducto.setText("Eliminar producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 240, -1));

        btnModificarProducto.setText("Modificar producto");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 240, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Valor unidad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Producto");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 80, -1));

        txtcantidadProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadProductosKeyTyped(evt);
            }
        });
        getContentPane().add(txtcantidadProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 180, -1));

        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 180, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cantidad:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        txtValorProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorProductosKeyTyped(evt);
            }
        });
        getContentPane().add(txtValorProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 180, -1));

        cmbElegirProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbElegirProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbElegirProductosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbElegirProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 150, -1));

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
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Elegir");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("¿Que deseas?");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6355.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 30, 330));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6355.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 30, 330));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoProductos.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 740, 330));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoProductos.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 740, 330));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6355.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 30, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vistaPrincipal.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed

        if (txtNombreProducto.getText().isEmpty() || txtValorProductos.getText().isEmpty() || txtcantidadProductos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar todos los datos");
        } else {
            try {
                String nombreProducto = txtNombreProducto.getText();
                int cantidad = Integer.parseInt(txtcantidadProductos.getText());
                int valor = Integer.parseInt(txtValorProductos.getText());
                Producto producto = new Producto(nombreProducto, valor, cantidad);
                vistaPrincipal.controladorCRUDProductos.añadirProductos(producto);
                JOptionPane.showMessageDialog(null, "Se ha añadido el producto");
                cmbElegirProductos.addItem(nombreProducto);
                limpiarCampos();
            } catch (ProductoYaExisteException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void limpiarCampos() {
        txtNombreProducto.setText(null);
        txtValorProductos.setText(null);
        txtcantidadProductos.setText(null);
        txtNombreProducto.setText(null);
        txtValorProductos.setText(null);
        txtcantidadProductos.setText(null);
    }
    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed

        String nombreProducto = String.valueOf(cmbElegirProductos.getSelectedItem());
        if (vistaPrincipal.controladorCRUDProductos.buscarPrducto(nombreProducto) == null) {
            JOptionPane.showMessageDialog(null, "El producto no existe o seleccione");
        } else {
            vistaPrincipal.controladorCRUDProductos.eliminarProducto(nombreProducto);
            JOptionPane.showMessageDialog(null, "Ha sido Eliminado, ahora escoge ¿Que Deseas?");
            limpiarCampos();
            cmbElegirProductos.removeItem(nombreProducto);

        }


    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        if (txtNombreProducto.getText().isEmpty() || txtValorProductos.getText().isEmpty() || txtcantidadProductos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Coloca todos los campos");
        } else {
            if (cmbElegirProductos.getSelectedItem().equals("Seleccionar")) {
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Debes seleccionar un producto o todavia no hay productos");

            }
            String nombreProducto = txtNombreProducto.getText();
            int cantidad = Integer.parseInt(txtcantidadProductos.getText());
            int valor = Integer.parseInt(txtValorProductos.getText());
            Producto producto = vistaPrincipal.controladorCRUDProductos.buscarPrducto(String.valueOf(cmbElegirProductos.getSelectedItem()));
            producto.setNombre(nombreProducto);
            producto.setCantidad(cantidad);
            producto.setValor(valor);
            cmbElegirProductos.removeItem(String.valueOf(cmbElegirProductos.getSelectedItem()));
            cmbElegirProductos.addItem(nombreProducto);
            JOptionPane.showMessageDialog(null, "Ha sido modificado, ahora escoge ¿Que Deseas?");
            limpiarCampos();

        }
    }//GEN-LAST:event_btnModificarProductoActionPerformed


    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        char validar = evt.getKeyChar();

        if (!Character.isLetter(validar) && validar != KeyEvent.VK_SPACE && validar != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtcantidadProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadProductosKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresa solo Numeros");
        }
    }//GEN-LAST:event_txtcantidadProductosKeyTyped

    private void txtValorProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorProductosKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Ingresa solo Numeros");
        }
    }//GEN-LAST:event_txtValorProductosKeyTyped

    private void cmbElegirProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElegirProductosActionPerformed
        String nombreProducto = String.valueOf(cmbElegirProductos.getSelectedItem());
        if (cmbElegirProductos.getSelectedItem().equals("Seleccionar")) {
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Debes seleccionar un producto o todavia no hay productos");

        } else {
            String nombre = vistaPrincipal.controladorCRUDProductos.buscarPrducto(nombreProducto).getNombre();
            int valor = vistaPrincipal.controladorCRUDProductos.buscarPrducto(nombreProducto).getValor();
            int cantidad = vistaPrincipal.controladorCRUDProductos.buscarPrducto(nombreProducto).getCantidad();
            txtNombreProducto.setText(nombre);
            txtValorProductos.setText(String.valueOf(valor));
            txtcantidadProductos.setText(String.valueOf(cantidad));
        }
    }//GEN-LAST:event_cmbElegirProductosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbElegirProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtValorProductos;
    private javax.swing.JTextField txtcantidadProductos;
    // End of variables declaration//GEN-END:variables
}