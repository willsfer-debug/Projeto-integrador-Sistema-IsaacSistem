package Telas;

public class telaprescrição extends javax.swing.JFrame {

    public telaprescrição() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtNumeroProntuario = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        txtNumeroCRM = new javax.swing.JTextField();
        Data1 = new javax.swing.JLabel();
        Nome2 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPrescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRESCRICÃO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnVoltar.setBackground(new java.awt.Color(255, 204, 0));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtNumeroProntuario.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroProntuario.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroProntuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), java.awt.Color.yellow));
        txtNumeroProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroProntuarioActionPerformed(evt);
            }
        });

        descricao.setBackground(new java.awt.Color(255, 255, 255));
        descricao.setForeground(new java.awt.Color(255, 204, 0));
        descricao.setText("Prescrição");

        txtNumeroCRM.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroCRM.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroCRM.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), java.awt.Color.yellow));
        txtNumeroCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCRMActionPerformed(evt);
            }
        });

        Data1.setBackground(new java.awt.Color(255, 255, 255));
        Data1.setForeground(new java.awt.Color(255, 204, 0));
        Data1.setText("Número CRM");

        Nome2.setBackground(new java.awt.Color(255, 255, 255));
        Nome2.setForeground(new java.awt.Color(255, 204, 0));
        Nome2.setText("Número Prontuário");

        btnAtualizar.setBackground(new java.awt.Color(255, 204, 0));
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        txtPrescricao.setBackground(new java.awt.Color(255, 255, 255));
        txtPrescricao.setColumns(20);
        txtPrescricao.setForeground(new java.awt.Color(0, 0, 0));
        txtPrescricao.setRows(5);
        txtPrescricao.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0)));
        jScrollPane1.setViewportView(txtPrescricao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNumeroProntuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nome2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Data1)
                            .addComponent(txtNumeroCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descricao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome2)
                    .addComponent(Data1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnAtualizar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        telaopcoes menuOpcoes = new telaopcoes();
        menuOpcoes.setVisible(true);
        menuOpcoes.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNumeroProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroProntuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroProntuarioActionPerformed

    private void txtNumeroCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCRMActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        String prontuario = txtNumeroProntuario.getText();
        String crm = txtNumeroCRM.getText();
        String prescricao = txtPrescricao.getText();

        if (prontuario.isEmpty() || crm.isEmpty() || prescricao.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos da prescrição!",
                    "Aviso",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this,
                "Prescrição gravada com sucesso!\n\n"
                + "Prontuário: " + prontuario + "\n"
                + "CRM Médico: " + crm,
                "Sucesso",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

        txtNumeroProntuario.setText("");
        txtNumeroCRM.setText("");
        txtPrescricao.setText("");
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(telaprescrição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaprescrição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaprescrição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaprescrição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaprescrição().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data1;
    private javax.swing.JLabel Nome2;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumeroCRM;
    private javax.swing.JTextField txtNumeroProntuario;
    private javax.swing.JTextArea txtPrescricao;
    // End of variables declaration//GEN-END:variables
}
