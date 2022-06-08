package projetoanuncionft;

import conexao.Conexao;
import forms.FormLogin;

public class ProjetoAnuncioNft {
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
        new FormLogin().setVisible(true);
    }
}