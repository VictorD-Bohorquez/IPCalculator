/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirip;

/**
 *
 * @author DANIEL
 */
public class Dirip extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Dirip() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSalir = new javax.swing.JButton();
        ip0 = new javax.swing.JTextField();
        ip1 = new javax.swing.JTextField();
        ip2 = new javax.swing.JTextField();
        ip3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resultado = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(0, 0, 102));
        BotonSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.setBorderPainted(false);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 70, 30));

        ip0.setBackground(new java.awt.Color(255, 255, 255));
        ip0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ip0.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(ip0, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, -1));

        ip1.setBackground(new java.awt.Color(255, 255, 255));
        ip1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ip1.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(ip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 70, -1));

        ip2.setBackground(new java.awt.Color(255, 255, 255));
        ip2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ip2.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(ip2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 70, -1));

        ip3.setBackground(new java.awt.Color(255, 255, 255));
        ip3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ip3.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(ip3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 70, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        result.setEditable(false);
        result.setBackground(new java.awt.Color(255, 255, 255));
        result.setColumns(20);
        result.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        result.setForeground(new java.awt.Color(0, 51, 51));
        result.setRows(5);
        resultado.setViewportView(result);

        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, 120));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa tu dirección IP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 230, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(".");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 30));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(".");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 30));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(".");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 30));

        fondo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        fondo.setForeground(new java.awt.Color(0, 0, 0));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 631, 397));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        short [] a = new short[4];
        a[0]=(Short.parseShort(ip0.getText()));
        a[1]=(Short.parseShort(ip1.getText()));
        a[2]=(Short.parseShort(ip2.getText()));
        a[3]=(Short.parseShort(ip3.getText()));
        if((a[0]&128)!=0)
        {
            if((a[0]&192)==192)
            {
                if((a[0]&224)==224)
                {
                  if((a[0]&240)==240)
                  {
                      result.setText("Clase: E\n");
                  }
                  else
                  {
                      result.setText("Clase: D\n");
                  }
                }
                else
                {
                    result.setText("Clase: C\n");
                if((a[3]&255)!=0)
                {
                if((a[3]&255)==255)
                {
                    result.append("Tipo: BROADCAST\n");
                }
                else
                {
                    result.append("Tipo: HOST\n");
                }
                }
            else
            {
                result.append("Tipo: RED\n");
            }
             result.append("IP Red:"+String.valueOf(a[0]&255)+". "+String.valueOf(a[1]&255)+". "+String.valueOf(a[2]&255)+". "+String.valueOf(a[3]&0)+"\n");
            result.append("IP Broadcast:"+String.valueOf(a[0]|0)+". "+String.valueOf(a[1]|0)+". "+String.valueOf(a[2]|0)+". "+String.valueOf(a[3]|255)+"\n");
            result.append("Rango de Red\n"+String.valueOf(a[0]&255)+". "+String.valueOf(a[1]&255)+". "+String.valueOf(a[2]&255)+". "+String.valueOf((a[3]&0)+1)+" - "+String.valueOf(a[0]|0)+". "+String.valueOf(a[1]|0)+". "+String.valueOf(a[2]|0)+". "+String.valueOf((a[3]|255)-1)+"\n");
                }
            }
            else
            {
                result.setText("Clase: B\n");
            if((a[2]&255)!=0 | (a[3]&255)!=0)
            {
                if((a[2]&255)==255 & (a[3]&255)==255)
                {
                    result.append("Tipo: BROADCAST\n");
                }
                else
                {
                    result.append("Tipo: HOST\n");
                }
            }
            else
            {
                result.append("Tipo: RED\n");
            }
             result.append("IP Red:"+String.valueOf(a[0]&255)+". "+String.valueOf(a[1]&255)+". "+String.valueOf(a[2]&0)+". "+String.valueOf(a[3]&0)+"\n");
            result.append("IP Broadcast:"+String.valueOf(a[0]|0)+". "+String.valueOf(a[1]|0)+". "+String.valueOf(a[2]|255)+". "+String.valueOf(a[3]|255)+"\n");
            result.append("Rango de Red:\n"+String.valueOf(a[0]&255)+". "+String.valueOf(a[1]&255)+". "+String.valueOf(a[2]&0)+". "+String.valueOf((a[3]&0)+1)+" - "+String.valueOf(a[0]|0)+". "+String.valueOf(a[1]|0)+". "+String.valueOf(a[2]|255)+". "+String.valueOf((a[3]|255)-1)+"\n");
            }
        }
        else
        {
            result.setText("Clase: A\n");
            if((a[1]&255)!=0 | (a[2]&255)!=0 | (a[3]&255)!=0)
            {
                if((a[1]&255)==255 & (a[2]&255)==255 & (a[3]&255)==255)
                {
                    result.append("Tipo: BROADCAST\n");
                }
                else
                {
                    result.append("Tipo: HOST\n");
                }
            }
            else
            {
                result.append("Tipo: RED\n");
            }
            result.append("IP Red:"+String.valueOf(a[0]&255)+". "+String.valueOf(a[1]&0)+". "+String.valueOf(a[2]&0)+". "+String.valueOf(a[3]&0)+"\n");
            result.append("IP Broadcast:"+String.valueOf(a[0]|0)+". "+String.valueOf(a[1]|255)+". "+String.valueOf(a[2]|255)+". "+String.valueOf(a[3]|255)+"\n");
            result.append("Rango de Red:\n"+String.valueOf(a[0]&255)+". "+String.valueOf(a[1]&0)+". "+String.valueOf(a[2]&0)+". "+String.valueOf((a[3]&0)+1)+" - "+String.valueOf(a[0]|0)+". "+String.valueOf(a[1]|255)+". "+String.valueOf(a[2]|255)+". "+String.valueOf((a[3]|255)-1)+"\n");
        }
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
            java.util.logging.Logger.getLogger(Dirip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dirip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dirip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dirip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dirip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField ip0;
    private javax.swing.JTextField ip1;
    private javax.swing.JTextField ip2;
    private javax.swing.JTextField ip3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextArea result;
    private javax.swing.JScrollPane resultado;
    // End of variables declaration//GEN-END:variables
}
