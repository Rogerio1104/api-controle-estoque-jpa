package br.com.senac.api.dto;

import br.com.senac.api.entidades.Lojas;
import br.com.senac.api.entidades.Produtos;

public class EstoquesResponse {

    private Long id;
    private LojasResponse loja;
    private ProdutosResponse produto;
    private Float quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LojasResponse getLoja() {
        return loja;
    }

    public void setLoja(LojasResponse loja) {
        this.loja = loja;
    }

    public ProdutosResponse getProduto() {
        return produto;
    }

    public void setProduto(ProdutosResponse produto) {
        this.produto = produto;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }
}
