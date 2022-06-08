package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public Connection getConexao(){
        try {
        //tentar estabelecer a conexao
            Connection conm = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/projetonft?serverTimezone=UTC",
            "root",
            "" 
            );
            return conm;
        } catch(Exception e)  {  
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}