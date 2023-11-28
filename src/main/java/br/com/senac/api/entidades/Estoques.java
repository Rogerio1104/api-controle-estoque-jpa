package br.com.senac.api.entidades;

import jakarta.persistence.*;

@Entity
public class Estoques {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "lojas_id")
    private Lojas loja;

    @ManyToOne()
    @JoinColumn(name = "produtos_id")
    private Produtos produto;

    @Column
    private Float quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Lojas getLoja() {
        return loja;
    }

    public void setLoja(Lojas loja) {
        this.loja = loja;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }
}
