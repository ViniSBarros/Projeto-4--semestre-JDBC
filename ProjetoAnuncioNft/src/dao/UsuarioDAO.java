package dao;

import beans.Usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    private Conexao conexao;
    private Connection conm;
    
    public UsuarioDAO() {
        this.conexao = new Conexao();
        this.conm = this.conexao.getConexao();
    }
    
    public boolean conferirUsernameExiste(String username) {
        String sql = "SELECT username FROM usuario WHERE username = '" + username  + "'";
        try{
            PreparedStatement stmt = this.conm.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                //não está vazio
                return true;
            } else {
                //está vazio
                return false;
              }
        } catch(Exception e){
            //System.out.println(e);
            return true;
        }
    }
    
    public boolean cadastrar(String username, String senha) {
        String sql = "INSERT INTO usuario(username, senha) VALUES ('" + username + "', '" + senha + "')";
        try{
            PreparedStatement stmt = this.conm.prepareStatement(sql);
            stmt.execute();
            return true;
        } catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public boolean logar(String username, String senha) {
        String sql = "SELECT username, senha FROM usuario WHERE username = '" + username + "' AND senha = '" + senha + "'";
        try{
            PreparedStatement stmt = this.conm.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                //conta encontrada
                return true;
            } else {
                //conta não encontrada
                return false;
              }
        } catch(Exception e){
            //System.out.println(e);
            return true;
        }
    }
    
    public boolean conferirAdministrador(String username) {
        String sql = "SELECT administrador FROM usuario WHERE username = '" + username  + "' AND administrador = 1";
        try{
            PreparedStatement stmt = this.conm.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                //é administrador
                return true;
            } else {
                //não é administrador
                return false;
              }
        } catch(Exception e){
            //System.out.println(e);
            return true;
        }
    }
}
