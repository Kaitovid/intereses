/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import model.Vehiculo;
import model.Vivienda;

/**
 *
 * @author bejar
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        lblOtros2.setVisible(false);
        cmbotro.setVisible(false);
        lblOtro.setVisible(false);
        TxtOtro.setVisible(false);
        rbtgcredito.add(rbtVivi);
        rbtgcredito.add(rbtVehi);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtgcredito = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblVlrCredito = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        Txtid = new javax.swing.JTextField();
        TxtvlrCredito = new javax.swing.JTextField();
        lblBotones = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblVrlFcredito = new javax.swing.JLabel();
        lblcredito = new javax.swing.JLabel();
        TxtOtro = new javax.swing.JTextField();
        lblOtro = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblOtros2 = new javax.swing.JLabel();
        cmbotro = new javax.swing.JComboBox<>();
        rbtVivi = new javax.swing.JRadioButton();
        rbtVehi = new javax.swing.JRadioButton();
        lblcredito1 = new javax.swing.JLabel();
        lblIntereses = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        lblTitulo.setText("CREDITOS");

        lblId.setBackground(new java.awt.Color(102, 255, 0));
        lblId.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        lblId.setText("ID");

        lblNombre.setBackground(new java.awt.Color(102, 255, 0));
        lblNombre.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        lblNombre.setText("NOMBRE");

        lblVlrCredito.setBackground(new java.awt.Color(102, 255, 0));
        lblVlrCredito.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        lblVlrCredito.setText("VALOR CREDITO");

        lblBotones.setBackground(new java.awt.Color(102, 255, 0));
        lblBotones.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        lblBotones.setText("TIPO DE CREDITO");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("CALCULAR");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblVrlFcredito.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblVrlFcredito.setText("Vlr Credito");

        lblcredito.setBackground(new java.awt.Color(153, 153, 0));
        lblcredito.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblcredito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TxtOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOtroActionPerformed(evt);
            }
        });

        lblOtro.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        lblOtro.setText("asdas");

        lbltotal.setBackground(new java.awt.Color(153, 153, 0));
        lbltotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbltotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Vlr  Total");

        lblOtros2.setBackground(new java.awt.Color(102, 255, 0));
        lblOtros2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        lblOtros2.setText("OTROS");

        cmbotro.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        cmbotro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbotro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbotroActionPerformed(evt);
            }
        });

        rbtVivi.setText("VIVIENDA");
        rbtVivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtViviActionPerformed(evt);
            }
        });

        rbtVehi.setText("VEHICULO");
        rbtVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVehiActionPerformed(evt);
            }
        });

        lblcredito1.setBackground(new java.awt.Color(153, 153, 0));
        lblcredito1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblcredito1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIntereses.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblIntereses.setText("Vlr Intereses");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblVrlFcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblIntereses, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(lblcredito1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblVlrCredito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(TxtvlrCredito, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbotro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbtVivi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbtVehi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(lblOtros2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOtro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVlrCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtvlrCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtVivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtVehi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOtros2)
                    .addComponent(cmbotro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVrlFcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcredito1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIntereses, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tipoVivienda=("C");
        
        int vlrcredito = Integer.parseInt(TxtvlrCredito.getText());
            if (cmbotro.getSelectedIndex()==1 && rbtVivi.isSelected()){
             
             String tipoCredito=("V");
             
             int area = Integer.parseInt(TxtOtro.getText());
              Vivienda vivi =new Vivienda(tipoVivienda,Txtid.getText(),TxtNombre.getText(),tipoCredito,vlrcredito);
              double vlrintereses = vivi.valorCuotaMes(area);
              vivi.presentarCuota(lbltotal, lblcredito, vlrintereses,lblcredito1,tipoVivienda);
       
        }else if(cmbotro.getSelectedIndex()==2 && rbtVivi.isSelected()){
             
             String tipoCredito=("V");
             Vivienda vivi =new Vivienda(tipoVivienda,Txtid.getText(),TxtNombre.getText(),tipoCredito,vlrcredito);
             int edad = Integer.parseInt(TxtOtro.getText());
             double vlrintereses = vivi.valorCuotaMes(edad);
             vivi.presentarCuota(lbltotal, lblcredito, vlrintereses, lblcredito1, tipoVivienda);
            lblOtro.setText("Edad cliente");
        }else if(cmbotro.getSelectedIndex()==1 && rbtVehi.isSelected()){
             String tipoCredito=("C");
             
             Vehiculo vivi =new Vehiculo(tipoVivienda,Txtid.getText(),TxtNombre.getText(),tipoCredito,vlrcredito);
             int modelo = Integer.parseInt(TxtOtro.getText());
             double vlrintereses = vivi.valorCuotaMes(modelo);
             vivi.presentarCuota(lbltotal, lblcredito, vlrintereses, lblcredito1, tipoVivienda);
            //lblOtro.setText("Año del modelo");
        }else if(cmbotro.getSelectedIndex()==2 && rbtVehi.isSelected()){
               String tipoCredito=("C");
             
             Vehiculo vivi =new Vehiculo(tipoVivienda,Txtid.getText(),TxtNombre.getText(),tipoCredito,vlrcredito);
             double cilindraje = Double.parseDouble(TxtOtro.getText());
             double vlrintereses = vivi.valorCuotaMes(cilindraje);
             vivi.presentarCuota(lbltotal, lblcredito, vlrintereses, lblcredito1, tipoVivienda);
            
            lblOtro.setText("Cilindraje");
     }


           
            
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtViviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtViviActionPerformed
     lblOtros2.setVisible(false);
        cmbotro.setVisible(false);
        cmbotro.removeAllItems();
        if (rbtVivi.isSelected()){
        lblOtros2.setVisible(true);
        cmbotro.setVisible(true);
        lblOtros2.setText("Tipo de Vivienda");
            cmbotro.addItem("--Selecione--");
            cmbotro.addItem("Casa");
            cmbotro.addItem("Apartamento");
      }

    }//GEN-LAST:event_rbtViviActionPerformed

    private void cmbotroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbotroActionPerformed
       lblOtro.setVisible(true);
       TxtOtro.setVisible(true);
        if(cmbotro.getSelectedIndex()==0) {   
            lblOtro.setVisible(false);
            TxtOtro.setVisible(false);
        }else if (cmbotro.getSelectedIndex()==1 && rbtVivi.isSelected()){
            lblOtro.setText("Area de la casa");
            
        }else if(cmbotro.getSelectedIndex()==2 && rbtVivi.isSelected()){
            lblOtro.setText("Edad cliente");
        }else if(cmbotro.getSelectedIndex()==1 && rbtVehi.isSelected()){
            lblOtro.setText("Año del modelo");
        }else if(cmbotro.getSelectedIndex()==2 && rbtVehi.isSelected()){
            lblOtro.setText("Cilindraje");
     }              
    }//GEN-LAST:event_cmbotroActionPerformed

    private void rbtVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtVehiActionPerformed
        lblOtros2.setVisible(false);
        cmbotro.setVisible(false);
        cmbotro.removeAllItems();
        if (rbtVehi.isSelected()){
        lblOtros2.setVisible(true);
        cmbotro.setVisible(true);
        lblOtros2.setText("Tipo de Vehiculo");
            cmbotro.addItem("--Selecione--");
            cmbotro.addItem("Automovil");
            cmbotro.addItem("Campero");
        }
    }//GEN-LAST:event_rbtVehiActionPerformed

    private void TxtOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOtroActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtOtro;
    private javax.swing.JTextField Txtid;
    private javax.swing.JTextField TxtvlrCredito;
    private javax.swing.JComboBox<String> cmbotro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBotones;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIntereses;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOtro;
    private javax.swing.JLabel lblOtros2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVlrCredito;
    private javax.swing.JLabel lblVrlFcredito;
    private javax.swing.JLabel lblcredito;
    private javax.swing.JLabel lblcredito1;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JRadioButton rbtVehi;
    private javax.swing.JRadioButton rbtVivi;
    private javax.swing.ButtonGroup rbtgcredito;
    // End of variables declaration//GEN-END:variables
}
