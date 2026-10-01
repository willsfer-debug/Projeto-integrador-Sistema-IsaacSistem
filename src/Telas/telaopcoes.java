package Telas;

public class telaopcoes extends javax.swing.JFrame {

    public telaopcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnmarcarConsulta = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        btnprescricao = new javax.swing.JButton();
        btnprocurarpaciente = new javax.swing.JButton();
        btvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECIONE UMA OPÇÃO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnmarcarConsulta.setBackground(new java.awt.Color(255, 204, 0));
        btnmarcarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnmarcarConsulta.setText("Marcar consulta");
        btnmarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmarcarConsultaActionPerformed(evt);
            }
        });

        btnProntuario.setBackground(new java.awt.Color(255, 204, 0));
        btnProntuario.setForeground(new java.awt.Color(255, 255, 255));
        btnProntuario.setText("Prontuário");
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });

        btnprescricao.setBackground(new java.awt.Color(255, 204, 0));
        btnprescricao.setForeground(new java.awt.Color(255, 255, 255));
        btnprescricao.setText("Prescrição");
        btnprescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprescricaoActionPerformed(evt);
            }
        });

        btnprocurarpaciente.setBackground(new java.awt.Color(255, 204, 0));
        btnprocurarpaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnprocurarpaciente.setText("Procurar paciente");
        btnprocurarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocurarpacienteActionPerformed(evt);
            }
        });

        btvoltar.setBackground(new java.awt.Color(255, 204, 0));
        btvoltar.setForeground(new java.awt.Color(255, 255, 255));
        btvoltar.setText("Voltar");
        btvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmarcarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(btnprescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprocurarpaciente))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmarcarConsulta)
                    .addComponent(btnProntuario))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprescricao)
                    .addComponent(btnprocurarpaciente))
                .addGap(40, 40, 40)
                .addComponent(btvoltar)
                .addGap(0, 82, Short.MAX_VALUE))
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

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        telaprontuario telaProntuario = new telaprontuario();
        telaProntuario.setVisible(true);
        telaProntuario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnprescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprescricaoActionPerformed
        telaprescrição telaPrescricao = new telaprescrição();
        telaPrescricao.setVisible(true);
        telaPrescricao.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnprescricaoActionPerformed

    private void btnprocurarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocurarpacienteActionPerformed
        telaprocurarpaciente telaProcurar = new telaprocurarpaciente();
        telaProcurar.setVisible(true);
        telaProcurar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnprocurarpacienteActionPerformed


    private void btvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltarActionPerformed
        telausuario telaUsuario = new telausuario();
        telaUsuario.setVisible(true);
        telaUsuario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btvoltarActionPerformed

    private void btnmarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmarcarConsultaActionPerformed
        Telamarcarconsulta telaMarcar = new Telamarcarconsulta();
        telaMarcar.setVisible(true);
        telaMarcar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnmarcarConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(telaopcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaopcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaopcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaopcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaopcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnmarcarConsulta;
    private javax.swing.JButton btnprescricao;
    private javax.swing.JButton btnprocurarpaciente;
    private javax.swing.JButton btvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
