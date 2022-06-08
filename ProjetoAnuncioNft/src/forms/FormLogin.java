package forms;

import java.awt.Color;
import javax.swing.JOptionPane;
import beans.Usuario;
import dao.UsuarioDAO;

public class FormLogin extends javax.swing.JFrame {

    public FormLogin() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlLogin = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblCadastrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login | Projeto NFT");
        setBackground(new java.awt.Color(232, 232, 234));
        setMaximumSize(new java.awt.Dimension(640, 439));
        setMinimumSize(new java.awt.Dimension(640, 439));
        setName("Login"); // NOI18N
        setResizable(false);

        jpnlLogin.setBackground(new java.awt.Color(232, 232, 234));

        lblIcon.setBackground(new java.awt.Color(232, 232, 234));
        lblIcon.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblIcon.setForeground(new java.awt.Color(0, 0, 0));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NFT100.png"))); // NOI18N
        lblIcon.setIconTextGap(0);

        lblUsuario.setBackground(new java.awt.Color(232, 232, 234));
        lblUsuario.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Usuário");

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtUsuario.setToolTipText("Digite o usuário!");

        lblSenha.setBackground(new java.awt.Color(232, 232, 234));
        lblSenha.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("Senha");

        pswSenha.setBackground(new java.awt.Color(255, 255, 255));
        pswSenha.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        pswSenha.setToolTipText("Digite a senha!");

        btnEntrar.setBackground(new java.awt.Color(102, 102, 102));
        btnEntrar.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setLabel("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblCadastrar.setBackground(new java.awt.Color(232, 232, 234));
        lblCadastrar.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastrar.setText("Não tem uma conta? Crie aqui!");
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpnlLoginLayout = new javax.swing.GroupLayout(jpnlLogin);
        jpnlLogin.setLayout(jpnlLoginLayout);
        jpnlLoginLayout.setHorizontalGroup(
            jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlLoginLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addGroup(jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUsuario)
                        .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSenha)
                    .addGroup(jpnlLoginLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnEntrar))
                    .addGroup(jpnlLoginLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblIcon))
                    .addComponent(lblCadastrar))
                .addGap(150, 150, 150))
        );
        jpnlLoginLayout.setVerticalGroup(
            jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlLoginLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEntrar)
                .addGap(18, 18, 18)
                .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        lblIcon.getAccessibleContext().setAccessibleName("lblIcon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        
        String usernameLogin = txtUsuario.getText();
        String senhaLogin = String.valueOf(pswSenha.getPassword());
        
        if(usuarioDAO.logar(usernameLogin, senhaLogin) == false) {
          JOptionPane.showMessageDialog(null, "Erro no login! Usuário ou senha incorreto!!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if(usuarioDAO.conferirAdministrador(usernameLogin)) {
              JOptionPane.showMessageDialog(null, "Bem-vindo, administrador!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
              usuario.setAdministrador(true);
              this.dispose();
              new FormNft().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Bem-vindo, usuário!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                usuario.setAdministrador(false);
                this.dispose();
                new FormRelatorioNft().setVisible(true);
            }
          }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        this.dispose();
        new FormCadastro().setVisible(true);
    }//GEN-LAST:event_lblCadastrarMouseClicked

    private void lblCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseEntered
        lblCadastrar.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblCadastrarMouseEntered

    private void lblCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseExited
        lblCadastrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCadastrarMouseExited

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPanel jpnlLogin;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
