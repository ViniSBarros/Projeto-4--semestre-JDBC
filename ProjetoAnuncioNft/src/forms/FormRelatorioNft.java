package forms;

import beans.Nft;
import dao.NftDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormRelatorioNft extends javax.swing.JFrame {

    public void preencheTabela(){
        NftDAO nftDAO = new NftDAO();
        List<Nft>listaNft = nftDAO.getNft();

        DefaultTableModel tabelaNft = (DefaultTableModel) tblNft.getModel();
        tabelaNft.setNumRows(0);
        
        for(Nft n: listaNft){
            Object[] obj = new Object[]{
                n.getId(),
                n.getNome(),
                n.getColecao(),
                n.getCategoria(),
                n.getDataCriacao(),
                n.getArtista(),
                n.getRaridade(),
                n.getValor(),
                n.getEmail(),
                n.getCelular()
                };
            tabelaNft.addRow(obj);
        }
    }

    public FormRelatorioNft() {
        initComponents();
        preencheTabela();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        tblNft = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório das NFTs");
        setMaximumSize(new java.awt.Dimension(1280, 600));
        setMinimumSize(new java.awt.Dimension(1280, 600));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("MS PGothic", 0, 48)); // NOI18N
        lblTitulo.setText("Relatório das NFTs");

        tblNft.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID:", "Nome:", "Coleção:", "Categoria:", "Data de Criação:", "Artista:", "Raridade:", "Valor:", "E-mail:", "Celular:"
            }
        ));
        ScrollPane.setViewportView(tblNft);
        if (tblNft.getColumnModel().getColumnCount() > 0) {
            tblNft.getColumnModel().getColumn(0).setMinWidth(75);
            tblNft.getColumnModel().getColumn(0).setPreferredWidth(75);
            tblNft.getColumnModel().getColumn(0).setMaxWidth(75);
            tblNft.getColumnModel().getColumn(1).setMinWidth(150);
            tblNft.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblNft.getColumnModel().getColumn(1).setMaxWidth(150);
            tblNft.getColumnModel().getColumn(2).setMinWidth(150);
            tblNft.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblNft.getColumnModel().getColumn(2).setMaxWidth(150);
            tblNft.getColumnModel().getColumn(3).setMinWidth(150);
            tblNft.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblNft.getColumnModel().getColumn(3).setMaxWidth(150);
            tblNft.getColumnModel().getColumn(4).setMinWidth(125);
            tblNft.getColumnModel().getColumn(4).setPreferredWidth(125);
            tblNft.getColumnModel().getColumn(4).setMaxWidth(125);
            tblNft.getColumnModel().getColumn(5).setMinWidth(150);
            tblNft.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblNft.getColumnModel().getColumn(5).setMaxWidth(150);
            tblNft.getColumnModel().getColumn(6).setMinWidth(100);
            tblNft.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblNft.getColumnModel().getColumn(6).setMaxWidth(100);
            tblNft.getColumnModel().getColumn(7).setMinWidth(100);
            tblNft.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblNft.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormRelatorioNft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioNft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioNft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioNft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelatorioNft().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblNft;
    // End of variables declaration//GEN-END:variables
}
