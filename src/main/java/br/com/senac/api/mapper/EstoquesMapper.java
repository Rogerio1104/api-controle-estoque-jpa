package br.com.senac.api.mapper;

import br.com.senac.api.dto.*;
import br.com.senac.api.entidades.Estoques;
import br.com.senac.api.entidades.Lojas;
import br.com.senac.api.entidades.Produtos;

public class EstoquesMapper {

    public static Estoques estoquesRequestEstoques(EstoquesRequest estoques) {
        Estoques out = new Estoques();

        Produtos produtos = ProdutosMapper.produtosRequestProtudos(estoques.getProduto());
        Lojas lojas = LojasMapper.lojasRequestLojas(estoques.getLoja());

        out.setId(estoques.getId());
        out.setLoja(lojas);
        out.setProduto(produtos);
        out.setQuantidade(estoques.getQuantidade());

        return out;
    }

    public static EstoquesResponse estoquesToEstoquesResponse(Estoques estoques) {
        EstoquesResponse out = new EstoquesResponse();

        ProdutosResponse produtos = ProdutosMapper.produtoToProdutosResponse(estoques.getProduto());
        LojasResponse lojas = LojasMapper.lojasToLojasResponse(estoques.getLoja());

        out.setId(estoques.getId());
        out.setLoja(lojas);
        out.setProduto(produtos);
        out.setQuantidade(estoques.getQuantidade());

        return out;
    }
}
