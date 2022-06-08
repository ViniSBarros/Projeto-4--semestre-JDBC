package forms;

import java.awt.Color;
import javax.swing.JOptionPane;
import beans.Usuario;
import dao.UsuarioDAO;

public class FormCadastro extends javax.swing.JFrame {

    public FormCadastro() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        lblConfirmarSenha = new javax.swing.JLabel();
        pswConfirmarSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        lblLogar = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de usuário | Projeto NFT");
        setBackground(new java.awt.Color(232, 232, 234));
        setMaximumSize(new java.awt.Dimension(640, 520));
        setMinimumSize(new java.awt.Dimension(640, 520));
        setName("Login"); // NOI18N
        setResizable(false);

        jpnlLogin.setBackground(new java.awt.Color(232, 232, 234));

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

        lblConfirmarSenha.setBackground(new java.awt.Color(232, 232, 234));
        lblConfirmarSenha.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblConfirmarSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblConfirmarSenha.setText("Confirmar Senha");

        pswConfirmarSenha.setBackground(new java.awt.Color(255, 255, 255));
        pswConfirmarSenha.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        pswConfirmarSenha.setToolTipText("Digite a senha novamente!");

        btnCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastrar.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblLogar.setBackground(new java.awt.Color(232, 232, 234));
        lblLogar.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblLogar.setForeground(new java.awt.Color(0, 0, 0));
        lblLogar.setText("Já tem uma conta? Logue aqui!");
        lblLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogarMouseExited(evt);
            }
        });

        lblIcon.setBackground(new java.awt.Color(232, 232, 234));
        lblIcon.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        lblIcon.setForeground(new java.awt.Color(0, 0, 0));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NFT100.png"))); // NOI18N
        lblIcon.setIconTextGap(0);

        javax.swing.GroupLayout jpnlLoginLayout = new javax.swing.GroupLayout(jpnlLogin);
        jpnlLogin.setLayout(jpnlLoginLayout);
        jpnlLoginLayout.setHorizontalGroup(
            jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlLoginLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlLoginLayout.createSequentialGroup()
                        .addGroup(jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogar)
                            .addGroup(jpnlLoginLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnCadastrar))
                            .addGroup(jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsuario)
                                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha)
                            .addComponent(pswConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmarSenha))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlLoginLayout.createSequentialGroup()
                        .addComponent(lblIcon)
                        .addGap(266, 266, 266))))
        );
        jpnlLoginLayout.setVerticalGroup(
            jpnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblConfirmarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(lblLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        
        usuario.setUsername(txtUsuario.getText());
        usuario.setSenha(String.valueOf(pswSenha.getPassword()));
        
        if(usuario.getSenha().length() < 8 || usuario.getSenha().length() > 15) {
            JOptionPane.showMessageDialog(null, "Senha inválida! A senha deve ter de 8 a 15 caracteres!!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if(usuario.getSenha().equals(String.valueOf(pswConfirmarSenha.getPassword())) == false) {
                  JOptionPane.showMessageDialog(null, "As senhas não conferem! Digite novamente com mais atenção!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if(usuario.getUsername().length() < 5 || usuario.getUsername().length() > 15) {
                    JOptionPane.showMessageDialog(null, "Nome de usuário inválido! O nome de usuário deve ter de 5 a 15 caracteres!!", "Erro", JOptionPane.ERROR_MESSAGE);
              } else if(usuarioDAO.conferirUsernameExiste(usuario.getUsername())) {
                        JOptionPane.showMessageDialog(null, "Nome de usuário inválido! Este nome de usuário já está em uso!!", "Erro", JOptionPane.ERROR_MESSAGE);
                  } else if(usuarioDAO.cadastrar(usuario.getUsername(), usuario.getSenha()) == false) {
                          JOptionPane.showMessageDialog(null, "Erro no cadastro!", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                         JOptionPane.showMessageDialog(null, "Cadastro efetuado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                         this.dispose();
                         new FormLogin().setVisible(true);
                      }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void lblLogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogarMouseClicked
        this.dispose();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_lblLogarMouseClicked

    private void lblLogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogarMouseEntered
        lblLogar.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblLogarMouseEntered

    private void lblLogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogarMouseExited
        lblLogar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblLogarMouseExited

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
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JPanel jpnlLogin;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLogar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswConfirmarSenha;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
