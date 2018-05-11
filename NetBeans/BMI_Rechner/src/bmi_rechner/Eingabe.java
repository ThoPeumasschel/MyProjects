/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_rechner;

/**
 *
 * @author thomas
 */
public class Eingabe extends javax.swing.JFrame {

    Ausgabe a = new Ausgabe();
    double gewicht; // in Kg
    double groesse; // in Metern 
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

        jPanel1 = new javax.swing.JPanel();
        labTitel = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labTitel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitel.setText("BMI Rechner");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labGroesse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labGewicht, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(btnSpeichern, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 14, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labGewicht, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(txtGewicht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents                        

    private void txtGewichtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnBerechnenActionPerformed(java.awt.event.ActionEvent evt) {                                             
        gewicht = Double.parseDouble(txtGewicht.getText());
        groesse = (Double.parseDouble(txtGroesse.getText())) / 100;
        erg = gewicht / Math.pow(groesse, 2);
        BMI = String.format("%.0f", erg);
        if (erg < 18.5) {
            txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + untergewicht);
        } else if (erg > 25) {
            txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + uebergewicht);
        } else {
            txtAusgabe.setText("    " + BMI + " = Body Mass Index (BMI)" + "\n\n" + normalgewicht);
        }


    }                                            

    private void btnSpeichernActionPerformed(java.awt.event.ActionEvent evt) {                                             
        a.speichern(BMI);
    }                                            

    // Variables declaration - do not modify//GEN-BEGIN:variables           
    private javax.swing.JButton btnBerechnen;
    private javax.swing.JButton btnSpeichern;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labGewicht;
    private javax.swing.JLabel labGroesse;
    private javax.swing.JLabel labTitel;
    private javax.swing.JTextArea txtAusgabe;
    private javax.swing.JTextField txtGewicht;
    private javax.swing.JTextField txtGroesse;
    // End of variables declaration//GEN-END:variables        
}
