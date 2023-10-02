/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCRUDCine;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelo.Silla;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;
import controlador.ControladorCRUDProductos;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class VistaPrincipal extends javax.swing.JFrame implements ActionListener {

    JButton[][] botones;
    ControladorCRUDCine controladorCRUDCine;
    controlador.ControladorCRUDProductos controladorCRUDProductos;
    public VistaPrincipal() {
        initComponents();
        botones = new JButton[10][12];
        controladorCRUDCine = new ControladorCRUDCine();
        controladorCRUDProductos= new ControladorCRUDProductos();
        setResizable(false);
        setLocationRelativeTo(null);
        cargarBotones();
        validarPosiciones();
        
        
        
    }

    public ControladorCRUDCine getControlador() {
        return controladorCRUDCine;
    }

    private void cargarBotones() {
        int ancho = 75;
        int alto = 50;
        int separado = 20;
        int texto = 1;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                boolean separarMatriz = j >= 6;
                if (separarMatriz) {
                    botones[i][j].setBounds(
                            (j * ancho + (separado * 4)),
                            (i * alto + (separado)),
                            ancho, alto);
                } else {
                    botones[i][j].setBounds(
                            (j * ancho + (separado)),
                            (i * alto + (separado)),
                            ancho, alto);
                }

                botones[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/silla.png")));
                botones[i][j].setText(String.valueOf(texto));
                botones[i][j].addActionListener(this);
                panelBotones.add(botones[i][j]);
                texto++;
            }
        }
    }

    public final void validarPosiciones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                Silla silla = controladorCRUDCine.obtenerSilla(i, j);
                switch (silla.getEstado()) {
                    case Silla.DISPONIBLE:
                        botones[i][j].setBackground(Color.WHITE);
                        botones[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/silla.png")));
                        break;
                    case Silla.DESHABILITADA:
                        botones[i][j].setBackground(Color.GRAY);
                        botones[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sillaDeshabilitada.png")));
                        break;
                    case Silla.OCUPADA:
                        botones[i][j].setBackground(Color.BLUE);
                        botones[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sillaOcupada.png")));
                        break;
                    default:
                        break;
                }

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (ae.getSource().equals(botones[i][j])) {
                    Silla silla = controladorCRUDCine.obtenerSilla(i, j);
                    int numero = Integer.parseInt(botones[i][j].getText());
                    switch (silla.getEstado()) {
                        case Silla.DISPONIBLE:
                            VistaIngreso vistaIngreso = new VistaIngreso(this, i, j, numero);
                            vistaIngreso.setVisible(true);
                            break;
                        case Silla.DESHABILITADA:
                            VistaDeshabilitada vistaDeshabilitada = new VistaDeshabilitada(this, i, j, numero);
                            vistaDeshabilitada.setVisible(true);
                            break;
                        case Silla.OCUPADA:
                            VistaOcupada vistaOcupada = new VistaOcupada(this, i, j, numero);
                            vistaOcupada.setVisible(true);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelPantalla = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(10, 580));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaHaciaArriba.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 50, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaHaciaAbajo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaHaciaAbajo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 190, 50, 210));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaHaciaArriba.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 380, 50, 210));

        jLabel6.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("A");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 60, -1));

        jLabel7.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("PASILLO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 60, -1));

        jLabel8.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("PASILLO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, 60, -1));

        jLabel9.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("B");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 170, 60, -1));

        jLabel13.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ELIGE TU PUESTO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("BIENVENIDO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 150, -1));

        jLabelPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3670.jpg"))); // NOI18N
        getContentPane().add(jLabelPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 590, 140));

        panelBotones.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color1"));

        jLabel11.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("C");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaHaciaArriba.png"))); // NOI18N
        jLabel12.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PASILLO");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaHaciaAbajo.png"))); // NOI18N

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 1000, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(467, 467, 467))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 1000, 540));

        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, -1, -1));

        jLabel16.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Portal de Productos");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, -1));

        jLabel15.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("SALIDA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 50, 30));

        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jButton2.setText("TERMINAR FUNCIÒN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, -1));

        jLabel19.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("SALIDA");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, 60, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1090, 680));

        btnProductos.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnProductos.setText("PRODUCTOS CINE");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4058271.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 120));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/terminar.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                controladorCRUDCine.terminarFuncion(i, j);
                validarPosiciones(); 
            }
        }
         JOptionPane.showMessageDialog(null, "Ha terminado la funcion");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        VistaEleccionProductos vistaEleccionProductos = new VistaEleccionProductos(this);
        vistaEleccionProductos.setVisible(true);
        validarPosiciones();
        
    }//GEN-LAST:event_btnProductosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPantalla;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables

}
