package beans;

public class Usuario {
    private String username;
    private String senha;
    private boolean administrador = false;
    
    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public boolean getAdministrador() {
        return administrador;
    }    
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAdministrador(boolean Administrador) {
        this.administrador = administrador;
    }
}
