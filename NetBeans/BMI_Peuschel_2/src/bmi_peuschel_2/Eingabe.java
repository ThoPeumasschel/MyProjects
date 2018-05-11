/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_peuschel_2;

/**
 *
 * @author tpeuschel
 */
public class Eingabe extends javax.swing.JFrame {

    Ausgabe a = new Ausgabe();
    double gewicht; // in Kg
    double groesse; // in Metern 
    static String sex;
    double erg;
    String BMI;
    String untergewicht = "Sie sollten auf ihr Körpergewicht achten. "
        + "\nAls Erwachsener besteht mit einem \n"
        + "Body-Mass-Index unter 18,5 Untergewicht. \n"
        + "Nehmen Sie auf keinen Fall weiter ab "
        + "\nund sprechen Sie mit Ihrem Arzt über Ihr Gewicht.";
    String normalgewicht = "Wir gratulieren Ihnen, Sie haben Ihr Gewicht "
        + "\ngut unter Kontrolle. Trotzdem sollten Sie sich "
        + "\nauch in Zukunft regelmäßig wiegen.";
    String uebergewicht = "Sie haben Übergewicht. Besonders bei \nzusätzlichen "
        + "Beschwerden wie Diabetes, \nGelenk- oder "
        + "Herz-Kreislauf-Problemen sollten \nSie versuchen abzunehmen. "
        + "Am Besten, \nSie sprechen mit Ihrem Hausarzt.";

    /**
     * Creates new form Eingabe
     */
    public Eingabe() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labGewicht = new javax.swing.JLabel();
        labGroesse = new javax.swing.JLabel();
        txtGewicht = new javax.swing.JTextField();
        txtGroesse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBerechnen = new javax.swing.JButton();
        btnSpeichern = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAusgabe = new javax.swing.JTextArea();
        labGeschlecht = new javax.swing.JLabel();
        radioBtnM = new javax.swing.JRadioButton();
        radioBtnW = new javax.swing.JRadioButton();
        labTitel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labGewicht.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labGewicht.setText("Bitte geben Sie Ihr Gewicht ein");

        labGroesse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labGroesse.setText("Bitte geben Sie Ihre Größe ein");

        txtGewicht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGewichtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Kg");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("cm");

        btnBerechnen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBerechnen.setText("BMI berechnen");
        btnBerechnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBerechnenActionPerformed(evt);
            }
        });

        btnSpeichern.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSpeichern.setText("Speichern");
        btnSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeichernActionPerformed(evt);
            }
        });

        txtAusgabe.setColumns(20);
        txtAusgabe.setRows(5);
        jScrollPane1.setViewportView(txtAusgabe);

        labGeschlecht.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labGeschlecht.setText("Geschlecht");

        buttonGroup1.add(radioBtnM);
        radioBtnM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioBtnM.setText("männlich");
        radioBtnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnW);
        radioBtnW.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioBtnW.setText("weiblich");
        radioBtnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labGroesse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtGewicht, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtGroesse, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBerechnen)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSpeichern, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labGeschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labGewicht, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(radioBtnM)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioBtnW))))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labGeschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnM)
                    .addComponent(radioBtnW))
                .addGap(7, 7, 7)
                .addComponent(labGewicht, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGewicht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(labGroesse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGroesse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBerechnen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeichern, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        labTitel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitel.setText("BMI Rechner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labTitel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 31, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGewichtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGewichtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGewichtActionPerformed

    private void btnBerechnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBerechnenActionPerformed
        gewicht = Double.parseDouble(txtGewicht.getText());
        groesse = (Double.parseDouble(txtGroesse.getText())) / 100;
        erg = gewicht / Math.pow(groesse, 2);
        BMI = String.format("%.0f", erg);

        if (sex.equals("m")) {

            if (erg < 18.5) {
                txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + untergewicht);
            } else if (erg > 25) {
                txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + uebergewicht);
            } else {
                txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + normalgewicht);
            }
        } else {
            if (erg < 17.5) {
                txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + untergewicht);
            } else if (erg > 24) {
                txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + uebergewicht);
            } else {
                txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + normalgewicht);
            }
        }
    }//GEN-LAST:event_btnBerechnenActionPerformed

    private void btnSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeichernActionPerformed
        a.speichern(BMI);    }//GEN-LAST:event_btnSpeichernActionPerformed

    private void radioBtnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMActionPerformed
        if (radioBtnM.isSelected()) {
            sex = "m";
        }
    }//GEN-LAST:event_radioBtnMActionPerformed

    private void radioBtnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnWActionPerformed
        if (radioBtnW.isSelected()) {
            sex = "w";
        }

    }//GEN-LAST:event_radioBtnWActionPerformed

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
            java.util.logging.Logger.getLogger(Eingabe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eingabe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eingabe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eingabe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eingabe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBerechnen;
    private javax.swing.JButton btnSpeichern;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labGeschlecht;
    private javax.swing.JLabel labGewicht;
    private javax.swing.JLabel labGroesse;
    private javax.swing.JLabel labTitel;
    private javax.swing.JRadioButton radioBtnM;
    private javax.swing.JRadioButton radioBtnW;
    private javax.swing.JTextArea txtAusgabe;
    private javax.swing.JTextField txtGewicht;
    private javax.swing.JTextField txtGroesse;
    // End of variables declaration//GEN-END:variables
}
