/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project1_perpustakaan;

/**
 *
 * @author Arnella
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dataAnggota = new javax.swing.JButton();
        dataBuku = new javax.swing.JButton();
        transaksiBuku = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));

        dataAnggota.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        dataAnggota.setForeground(new java.awt.Color(0, 51, 102));
        dataAnggota.setText("DATA ANGGOTA");
        dataAnggota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dataAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAnggotaActionPerformed(evt);
            }
        });

        dataBuku.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        dataBuku.setForeground(new java.awt.Color(0, 51, 102));
        dataBuku.setText("DATA BUKU");
        dataBuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataBukuActionPerformed(evt);
            }
        });

        transaksiBuku.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        transaksiBuku.setForeground(new java.awt.Color(0, 51, 102));
        transaksiBuku.setText("TRANSAKSI BUKU");
        transaksiBuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        transaksiBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiBukuActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_perpustakaan/4.png"))); // NOI18N

        logoutButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 51, 102));
        logoutButton.setText("LOGOUT");
        logoutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transaksiBuku)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(29, 29, 29)))
                .addGap(328, 328, 328))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(dataAnggota)
                .addGap(31, 31, 31)
                .addComponent(dataBuku)
                .addGap(31, 31, 31)
                .addComponent(transaksiBuku)
                .addGap(30, 30, 30)
                .addComponent(logoutButton)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transaksiBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiBukuActionPerformed
        String TransaksiBuku = "TransaksiBuku"; 
        switchToFrame(TransaksiBuku);
    }//GEN-LAST:event_transaksiBukuActionPerformed

    private void dataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataBukuActionPerformed
        String DataBuku = "DataBuku"; 
        switchToFrame(DataBuku);
    }//GEN-LAST:event_dataBukuActionPerformed

    private void dataAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAnggotaActionPerformed
        String DataAnggota = "DataAnggota"; 
        switchToFrame(DataAnggota);
    }//GEN-LAST:event_dataAnggotaActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        String PerpustakaanApp = "PerpustakaanApp"; 
        switchToFrame(PerpustakaanApp);
    }//GEN-LAST:event_logoutButtonActionPerformed

   private void switchToFrame(String frameName) {
    try {
        if (frameName.equals("TransaksiBuku")) {
            TransaksiBuku transaksiBukuFrame = new TransaksiBuku();
            transaksiBukuFrame.setVisible(true);
        } else if (frameName.equals("DataBuku")) {
            DataBuku dataBukuFrame = new DataBuku();
            dataBukuFrame.setVisible(true);
        } else if (frameName.equals("DataAnggota")) {
            DataAnggota dataAnggotaFrame = new DataAnggota();
            dataAnggotaFrame.setVisible(true);
        } else if (frameName.equals("PerpustakaanApp")) {
            PerpustakaanApp perpustakaanAppFrame = new PerpustakaanApp();
            perpustakaanAppFrame.setVisible(true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataAnggota;
    private javax.swing.JButton dataBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton transaksiBuku;
    // End of variables declaration//GEN-END:variables

    
}
