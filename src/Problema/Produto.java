package Problema;

public class Produto {

    private String nome;
    private Integer quantidadeDeProduto;
    private Double precoUnitario;

    public Produto(String nome, Integer quantidadeDeProduto, Double precoUnitario) {
        this.nome = nome;
        this.quantidadeDeProduto = quantidadeDeProduto;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDeProduto() {
        return quantidadeDeProduto;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }
}
