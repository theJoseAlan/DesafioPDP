package entity;

public class Livro {

    private String nome;

    private String autor;

    private Double preco;

    private char tipo_promocao;

    private String dataPromocaoInicio;

    private String dataPromocaoFim;

    private Double precoComDesconto;

    private int porcentagem;


    public Livro(){

    }

    public Livro(String nome, String autor, Double preco, char tipo_promocao,
                 String dataPromocaoInicio, String dataPromocaoFim, Double precoComDesconto, int porcentagem) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.tipo_promocao = tipo_promocao;
        this.dataPromocaoInicio = dataPromocaoInicio;
        this.dataPromocaoFim = dataPromocaoFim;
        this.precoComDesconto = precoComDesconto;
        this.porcentagem = porcentagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public char getTipo_promocao() {
        return tipo_promocao;
    }

    public void setTipo_promocao(char tipo_promocao) {
        this.tipo_promocao = tipo_promocao;
    }

    public String getDataPromocaoInicio() {
        return dataPromocaoInicio;
    }

    public void setDataPromocaoInicio(String dataPromocaoInicio) {
        this.dataPromocaoInicio = dataPromocaoInicio;
    }

    public String getDataPromocaoFim() {
        return dataPromocaoFim;
    }

    public void setDataPromocaoFim(String dataPromocaoFim) {
        this.dataPromocaoFim = dataPromocaoFim;
    }

    public Double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(Double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }
}

