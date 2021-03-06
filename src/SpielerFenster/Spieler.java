
package SpielerFenster;

/**
 *
 * @author Saim Arslantepe
 * @author Adrian Weller
 * @author Rainer Huß
 * 
 * EVENTS FEHLEN ZU DEN BUTTONS !! 
 * JTabele1 bis jetzt keine Connection zur Datenbank
 */
public class Spieler extends javax.swing.JFrame {

    /**
     * Creates new form Spieler
     */
    public Spieler() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SpielerBearbeitenButton = new javax.swing.JButton();
        SpielerHinzufügenButton = new javax.swing.JButton();
        Exportieren = new javax.swing.JButton();
        ListeAnzeigen = new javax.swing.JButton();
        ListeChecken = new javax.swing.JButton();
        SpielerSuchen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SpielerTabelle = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SpielerBearbeitenButton.setText("Spieler bearbeiten");
        SpielerBearbeitenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpielerBearbeitenButtonActionPerformed(evt);
            }
        });

        SpielerHinzufügenButton.setText("Spieler hinzufügen");
        SpielerHinzufügenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpielerHinzufügenButtonActionPerformed(evt);
            }
        });

        Exportieren.setText("Spielerliste exportieren");

        ListeAnzeigen.setText("Spielerliste anzeigen");

        ListeChecken.setText("Spielerliste prüfen");

        SpielerSuchen.setText("Spieler suchen");
        SpielerSuchen.setToolTipText("");
        SpielerSuchen.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tele-Marines", 3, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Spieler");

        SpielerTabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Vorname", "Nachname", "Nickname", "Punktzahl", "Win/Lose", "Anwesenheit", "Bezahlt", "E-Mail Adresse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SpielerTabelle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Exportieren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpielerHinzufügenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpielerBearbeitenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListeAnzeigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListeChecken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpielerSuchen))
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(SpielerSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SpielerBearbeitenButton)
                        .addGap(18, 18, 18)
                        .addComponent(SpielerHinzufügenButton)
                        .addGap(18, 18, 18)
                        .addComponent(Exportieren)
                        .addGap(18, 18, 18)
                        .addComponent(ListeAnzeigen)
                        .addGap(18, 18, 18)
                        .addComponent(ListeChecken))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(936, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Öffnet Spieler Hinzufügen Fenster
     * @param evt 
     */
    private void SpielerHinzufügenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpielerHinzufügenButtonActionPerformed
        SpielerHinzufügen run = new SpielerHinzufügen();
        run.setVisible(true);
    }//GEN-LAST:event_SpielerHinzufügenButtonActionPerformed
    
    /**
     * Öffnet Spieler Bearbeiten Fenster
     * @param evt 
     */
    private void SpielerBearbeitenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpielerBearbeitenButtonActionPerformed
       SpielerBearbeiten run = new SpielerBearbeiten();
       run.setVisible(true);
    }//GEN-LAST:event_SpielerBearbeitenButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Spieler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spieler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spieler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spieler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Spieler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exportieren;
    private javax.swing.JButton ListeAnzeigen;
    private javax.swing.JButton ListeChecken;
    private javax.swing.JButton SpielerBearbeitenButton;
    private javax.swing.JButton SpielerHinzufügenButton;
    private javax.swing.JTextField SpielerSuchen;
    private javax.swing.JTable SpielerTabelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
