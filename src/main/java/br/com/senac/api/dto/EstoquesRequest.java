package br.com.senac.api.dto;

import br.com.senac.api.entidades.Lojas;
import br.com.senac.api.entidades.Produtos;

public class EstoquesRequest {

    private Long id;
    private LojasRequest loja;
    private ProdutosRequest produto;
    private Float quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LojasRequest getLoja() {
        return loja;
    }

    public void setLoja(LojasRequest loja) {
        this.loja = loja;
    }

    public ProdutosRequest getProduto() {
        return produto;
    }

    public void setProduto(ProdutosRequest produto) {
        this.produto = produto;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }
}
