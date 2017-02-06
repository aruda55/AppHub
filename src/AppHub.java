/*
 * Ahmed Ruda
 * January 31st, 2017
 * AppHub menu
 */
package AppHub;

import javax.swing.JOptionPane;

public class AppHub extends javax.swing.JFrame {

    public AppHub() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGreeting = new javax.swing.JLabel();
        btnApp9 = new javax.swing.JButton();
        btnApp7 = new javax.swing.JButton();
        txtSearchItem = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnApp5 = new javax.swing.JButton();
        btnApp1 = new javax.swing.JButton();
        btnApp2 = new javax.swing.JButton();
        btnApp3 = new javax.swing.JButton();
        btnApp4 = new javax.swing.JButton();
        btnApp6 = new javax.swing.JButton();
        btnApp8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AppHub");

        lblGreeting.setFont(new java.awt.Font("PT Serif Caption", 1, 36)); // NOI18N
        lblGreeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGreeting.setText("AppHub");

        btnApp9.setText("App");

        btnApp7.setText("App");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnApp5.setText("App");
        btnApp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApp5ActionPerformed(evt);
            }
        });

        btnApp1.setText("App");
        btnApp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApp1ActionPerformed(evt);
            }
        });

        btnApp2.setText("App");
        btnApp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApp2ActionPerformed(evt);
            }
        });

        btnApp3.setText("App");
        btnApp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApp3ActionPerformed(evt);
            }
        });

        btnApp4.setText("App");

        btnApp6.setText("App");

        btnApp8.setText("App");
        btnApp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApp8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGreeting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchItem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApp4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApp5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnApp6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApp7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApp8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnApp9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApp1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApp2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApp3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblGreeting, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApp1)
                    .addComponent(btnApp2)
                    .addComponent(btnApp3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApp4)
                    .addComponent(btnApp5)
                    .addComponent(btnApp6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApp7)
                    .addComponent(btnApp9)
                    .addComponent(btnApp8))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApp1ActionPerformed

    }//GEN-LAST:event_btnApp1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchItem = txtSearchItem.getText();
        String itemSearch = "";

        if (searchItem.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a search item");
        } else {
            try {
                for (int i = 0; i < searchItem.length(); i++) {
                    if (searchItem.charAt(i) == ' ') {
                        itemSearch += '+';
                    } else {
                        itemSearch += searchItem.charAt(i);
                    }
                }
                System.out.println(itemSearch);
                //Online drawing tool of stage outline
                String URL = "https://www.google.com/#q=" + itemSearch;
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnApp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApp2ActionPerformed


    }//GEN-LAST:event_btnApp2ActionPerformed

    private void btnApp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApp8ActionPerformed
        JOptionPane.showMessageDialog(null, "For Application Support\nCall: 519-830-3579"
                + "\nText: 519-830-3579\nEmail: aruda0421@gmail.com", "Application Support", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnApp8ActionPerformed

    private void btnApp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApp3ActionPerformed

    }//GEN-LAST:event_btnApp3ActionPerformed

    private void btnApp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApp5ActionPerformed

    }//GEN-LAST:event_btnApp5ActionPerformed

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
            java.util.logging.Logger.getLogger(AppHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApp1;
    private javax.swing.JButton btnApp2;
    private javax.swing.JButton btnApp3;
    private javax.swing.JButton btnApp4;
    private javax.swing.JButton btnApp5;
    private javax.swing.JButton btnApp6;
    private javax.swing.JButton btnApp7;
    private javax.swing.JButton btnApp8;
    private javax.swing.JButton btnApp9;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JTextField txtSearchItem;
    // End of variables declaration//GEN-END:variables
}
