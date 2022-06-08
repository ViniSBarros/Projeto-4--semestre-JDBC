package dao;

import beans.Nft;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NftDAO {
    private Conexao conexao;
    private Connection conm;

    public NftDAO(){
        this.conexao = new Conexao();
        this.conm = this.conexao.getConexao();
    }

    public boolean inserir(Nft nft){
        String sql = "INSERT INTO nft(nome, colecao, categoria, artista, raridade, valor, email, celular) VALUES " + "(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conm.prepareStatement(sql);

            stmt.setString(1, nft.getNome());
            stmt.setString(2, nft.getColecao());
            stmt.setString(3, nft.getCategoria());
            stmt.setString(4, nft.getArtista());
            stmt.setString(5, nft.getRaridade());
            stmt.setDouble(6, nft.getValor());
            stmt.setString(7, nft.getEmail());
            stmt.setString(8, nft.getCelular());
            stmt.execute();
            
            return true;
        }catch(Exception e){
            System.out.println("Erro ao inserir nft: " + e.getMessage());
            return false;
        }
    }

    public void pesquisar(int id, Nft nft) {
        String sql = "SELECT * FROM nft WHERE ID = " + id;

        try {
            PreparedStatement stmt = this.conm.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            //System.out.println("DAO " + nft);
            rs.next();

            nft.setId(rs.getInt("id"));
            nft.setNome(rs.getString("nome"));
            nft.setColecao(rs.getString("colecao"));
            nft.setCategoria(rs.getString("categoria"));
            nft.setDataCriacao(rs.getString("data_criacao"));
            nft.setArtista(rs.getString("artista"));
            nft.setRaridade(rs.getString("raridade"));                               
            nft.setValor(rs.getDouble("valor"));
            nft.setEmail(rs.getString("email"));
            nft.setCelular(rs.getString("celular"));

        }catch(Exception e){
            System.out.println("Erro ao pesquisar nft: " + e.getMessage());
        }
    }

    public boolean editar(int id, Nft nft){
        String sql = "UPDATE nft SET nome=?, colecao=?, categoria=?, artista=?, raridade=?, valor=?, email=?, celular=? WHERE id='" + id + "'";

        try {
            PreparedStatement stmt = this.conm.prepareStatement(sql);

            stmt.setString(1, nft.getNome());
            stmt.setString(2, nft.getColecao());
            stmt.setString(3, nft.getCategoria());
            stmt.setString(4, nft.getArtista());
            stmt.setString(5, nft.getRaridade());
            stmt.setDouble(6, nft.getValor());
            stmt.setString(7, nft.getEmail());
            stmt.setString(8, nft.getCelular());
            stmt.execute();
            
            return true;
        }catch(Exception e){
            System.out.println("Erro ao editar nft: " + e.getMessage());
            return false;
            }
        }

    public boolean excluir(int id){
        String sql = "DELETE FROM nft WHERE id='" + id + "'";
        try{
            PreparedStatement stmt = this.conm.prepareStatement(sql);
            stmt.execute();
            return true;
        }catch(Exception e){
            System.out.println("Erro ao excluir nft: " + e.getMessage());
            return false;
        }
    }

    /*
    public Nft getNft(int id){
        String sql = "SELECT * FROM nft WHERE id =?";
        try{
            PreparedStatement stmt = this.conm.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Nft nft = new Nft();

            rs.first();
            nft.setId(id);
            nft.setNome(rs.getString("nome"));

            return nft;
        }catch(Exception e){
            return null;
        }

    }
    */

    public List<Nft> getNft(){
        String sql = "SELECT nft.id as id, nome, colecao, categoria, data_criacao, artista, raridade, valor, email, celular FROM projetonft.nft";
        try{
            PreparedStatement stmt = this.conm.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Nft> lista = new ArrayList<>();

            while(rs.next()){
                Nft nft = new Nft();

                nft.setId(rs.getInt("id"));
                nft.setNome(rs.getString("nome"));
                nft.setColecao(rs.getString("colecao"));
                nft.setCategoria(rs.getString("categoria"));
                nft.setDataCriacao(rs.getString("data_criacao"));
                nft.setArtista(rs.getString("artista"));
                nft.setRaridade(rs.getString("raridade"));                               
                nft.setValor(rs.getDouble("valor"));
                nft.setEmail(rs.getString("email"));
                nft.setCelular(rs.getString("celular"));

                lista.add(nft);
            }

            return lista;
        }
        catch(Exception e){
            return null;
        }
    }


}
