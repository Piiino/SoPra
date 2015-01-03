
package HauptFenster;

import EventFenster.Event;
import SpielerFenster.Spieler;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/**
 *
 * @author Saim Arslantepe
 * @author Adrian Weller
 * @author Rainer Huß
 * 
 * Gewisse Aktionen zu Buttons fehlt noch
 */
public class Hauptmenu extends javax.swing.JFrame {
   

    /**
     * Creates new form Hauptmenu
     */
    public Hauptmenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AusloggenButton = new javax.swing.JButton();
        EinstellungenButton = new javax.swing.JButton();
        HilfeButton = new javax.swing.JButton();
        ProfilButton = new javax.swing.JButton();
        NotizenButton = new javax.swing.JButton();
        SpielerButton = new javax.swing.JButton();
        EventButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AusloggenButton.setText("X");
        AusloggenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AusloggenButtonActionPerformed(evt);
            }
        });

        EinstellungenButton.setText("Einstellungen");
        EinstellungenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EinstellungenButtonActionPerformed(evt);
            }
        });

        HilfeButton.setText("Hilfe");

        ProfilButton.setText("Profil");

        NotizenButton.setText("Notizen");
        NotizenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotizenButtonActionPerformed(evt);
            }
        });

        SpielerButton.setText("Spieler");
        SpielerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpielerButtonActionPerformed(evt);
            }
        });

        EventButton.setText("Event Starten");
        EventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tele-Marines", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Hauptmenu");

        jButton1.setText("Gebannte Spieler");

        jButton2.setText("Gebannte Karten");

        jButton3.setText("Spielregeln");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(AusloggenButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EventButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SpielerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HilfeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NotizenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EinstellungenButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AusloggenButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EventButton)
                    .addComponent(HilfeButton)
                    .addComponent(EinstellungenButton))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpielerButton)
                    .addComponent(ProfilButton)
                    .addComponent(NotizenButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(526, 287));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Öffnet das kleine Fenster zum Ausloggen
     * HauptFenster im Hintergrund geöffnet
     * @param evt 
     */
    private void AusloggenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AusloggenButtonActionPerformed
        Ausloggen run = new Ausloggen();
        run.setVisible(true);
        
    }//GEN-LAST:event_AusloggenButtonActionPerformed
    /**
     * Öffnet das Fenster Event
     * HauptFenster im Hintergrund geöffnet
     * @param evt 
     */
    private void EventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventButtonActionPerformed
     Event run = new Event();
     run.setVisible(true);
    }//GEN-LAST:event_EventButtonActionPerformed
    /**
     * SpielerFenster wird geöffnet
     * HauptFenster im Hintergrund geöffnet
     * @param evt 
     */
    private void SpielerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpielerButtonActionPerformed
        Spieler run = new Spieler();
        run.setVisible(true);
    }//GEN-LAST:event_SpielerButtonActionPerformed

    private void EinstellungenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EinstellungenButtonActionPerformed
        Einstellungen run = new Einstellungen();
        run.setVisible(true);
    }//GEN-LAST:event_EinstellungenButtonActionPerformed

    private void NotizenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotizenButtonActionPerformed
        Notizen run = new Notizen();
        run.setVisible(true);
    }//GEN-LAST:event_NotizenButtonActionPerformed
   
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
            java.util.logging.Logger.getLogger(Hauptmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hauptmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hauptmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hauptmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hauptmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AusloggenButton;
    private javax.swing.JButton EinstellungenButton;
    private javax.swing.JButton EventButton;
    private javax.swing.JButton HilfeButton;
    private javax.swing.JButton NotizenButton;
    private javax.swing.JButton ProfilButton;
    private javax.swing.JButton SpielerButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
