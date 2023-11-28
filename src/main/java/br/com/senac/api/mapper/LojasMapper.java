package br.com.senac.api.mapper;

import br.com.senac.api.dto.LojasRequest;
import br.com.senac.api.dto.LojasResponse;
import br.com.senac.api.entidades.Lojas;

public class LojasMapper {

    public static Lojas lojasRequestLojas(LojasRequest lojas){
        Lojas out = new Lojas();

        out.setId(lojas.getId());
        out.setNome(lojas.getNome());
        out.setCnpj(lojas.getCnpj());
        out.setResponsavel(lojas.getResponsavel());

        return out;
    }
    public static LojasResponse lojasToLojasResponse(Lojas lojas){
        LojasResponse out = new LojasResponse();

        out.setId(lojas.getId());
        out.setNome(lojas.getNome());
        out.setCnpj(lojas.getCnpj());
        out.setResponsavel(lojas.getResponsavel());

        return out;
    }
}
