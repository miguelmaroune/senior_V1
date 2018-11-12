
package army.views;


public class Search_cl extends javax.swing.JFrame {

   
    public Search_cl() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        cb6 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/icons/magnifier.png"))); // NOI18N
        jPanel1.add(jButton1);
        jButton1.setBounds(830, 10, 105, 100);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First name", "Last name", "Rank", "D O B", "Platoon Id", "Phone #", "Position", "Blood type", "Driving license", "Training Id", "Sanction ID", "Rest List"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 1130, 402);

        jButton2.setText("Edit");
        jPanel1.add(jButton2);
        jButton2.setBounds(990, 10, 90, 40);

        jButton3.setText("Archive");
        jPanel1.add(jButton3);
        jButton3.setBounds(990, 70, 90, 40);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Training Id" }));
        jPanel2.add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 90, 20));

        cb5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Driving ID" }));
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });
        jPanel2.add(cb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 100, 20));
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 100, -1));
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 100, 20));

        cb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id ", "First Name", "Last Name", "Rank", "Blood Type", " " }));
        jPanel2.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 110, 20));

        cb6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sanction ID" }));
        jPanel2.add(cb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 100, 20));
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 114, 20));
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Please choose the criteria");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/icons/Operational_Camouflage_Pattern_(OCP),_Scorpion_W2_swatch.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 810, 110));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 20, 810, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/icons/Operational_Camouflage_Pattern_(OCP),_Scorpion_W2_swatch.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1160, 540);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1160, 540);

        setBounds(0, 0, 1179, 582);
    }// </editor-fold>//GEN-END:initComponents

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb5ActionPerformed

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
            java.util.logging.Logger.getLogger(Search_cl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_cl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_cl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_cl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_cl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JComboBox<String> cb6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
