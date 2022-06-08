package beans;

public class Nft {
    private int id;
    private String nome;
    private String colecao;
    private String categoria;
    private String dataCriacao;
    private String artista;
    private String email;
    private String celular;
    private String raridade;
    private double valor;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getColecao() {
        return colecao;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getArtista() {
        return artista;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getRaridade() {
        return raridade;
    }

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
