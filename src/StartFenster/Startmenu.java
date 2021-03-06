
package StartFenster;

import Login.LoginFenster;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Saim Arslantepe
 * @author Adrian Weller
 * @author Rainer Huß
 * 
 */
public class Startmenu extends javax.swing.JFrame {

    /**
     * Creates new form Startmenu
     */
    public Startmenu() {
        initComponents();
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartenButton = new javax.swing.JButton();
        VoranmeldungButton = new javax.swing.JButton();
        NewsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StartenButton.setText("Starten");
        StartenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartenButtonMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StartenButtonMouseReleased(evt);
            }
        });
        StartenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartenButtonActionPerformed(evt);
            }
        });

        VoranmeldungButton.setText("Voranmeldung");
        VoranmeldungButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VoranmeldungButtonMouseReleased(evt);
            }
        });
        VoranmeldungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoranmeldungButtonActionPerformed(evt);
            }
        });

        NewsButton.setText("News");
        NewsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NewsButtonMouseReleased(evt);
            }
        });
        NewsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(VoranmeldungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(StartenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoranmeldungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(688, 283));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Methode zum öffnen von der Startseite
     * @param evt 
     */
    private void NewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewsButtonActionPerformed
        WebsiteOpener run = new WebsiteOpener();
        run.OpenWebsite("http://www.heidelbaer.de/dyn/home");
                
    }//GEN-LAST:event_NewsButtonActionPerformed
    /**
     * Fenster Voranmeldung wird geöffnet
     * @param evt 
     */
    private void VoranmeldungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoranmeldungButtonActionPerformed
        Voranmeldung run = new Voranmeldung();
        run.setVisible(true);
    }//GEN-LAST:event_VoranmeldungButtonActionPerformed
    /**
     * LoginFenster wird aufgerufen und StartFenster wird geschlossen
     * @param evt 
     */
    private void StartenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartenButtonActionPerformed
        dispose();
        LoginFenster run = new LoginFenster();
        run.setVisible(true);
    }//GEN-LAST:event_StartenButtonActionPerformed

    private void StartenButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartenButtonMouseClicked
        
    }//GEN-LAST:event_StartenButtonMouseClicked

    private void StartenButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartenButtonMouseReleased
        playSound("WindowsDefault.wav");
    }//GEN-LAST:event_StartenButtonMouseReleased

    private void VoranmeldungButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoranmeldungButtonMouseReleased
        playSound("WindowsDefault.wav");
    }//GEN-LAST:event_VoranmeldungButtonMouseReleased

    private void NewsButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsButtonMouseReleased
        playSound("WindowsDefault.wav");
    }//GEN-LAST:event_NewsButtonMouseReleased
    public void playSound(String soundName)
    {
        try 
        {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }
        catch(Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
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
            java.util.logging.Logger.getLogger(Startmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewsButton;
    private javax.swing.JButton StartenButton;
    private javax.swing.JButton VoranmeldungButton;
    // End of variables declaration//GEN-END:variables
}
