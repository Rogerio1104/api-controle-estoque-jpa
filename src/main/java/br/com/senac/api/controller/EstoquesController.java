package br.com.senac.api.controller;

import br.com.senac.api.dto.EstoquesRequest;
import br.com.senac.api.dto.EstoquesResponse;
import br.com.senac.api.entidades.Estoques;
import br.com.senac.api.entidades.Lojas;
import br.com.senac.api.mapper.EstoquesMapper;
import br.com.senac.api.mapper.LojasMapper;
import br.com.senac.api.mapper.ProdutosMapper;
import br.com.senac.api.repositorios.EstoquesRepository;
import br.com.senac.api.repositorios.LojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/estoques")
@CrossOrigin
public class EstoquesController {

    @Autowired
    private EstoquesRepository estoquesRepository;

    @PostMapping("/")
    @CrossOrigin
    public ResponseEntity<Estoques> criarEstoques(@RequestBody Estoques estoques){
        Estoques retorno = estoquesRepository.save(estoques);

        return ResponseEntity.status(HttpStatus.CREATED).body(retorno);
    }
    @GetMapping("/")
    @CrossOrigin
    public ResponseEntity<List<Estoques>> carregarEstoques(){
        List<Estoques> retorno = estoquesRepository.findAll();

        return ResponseEntity.ok(retorno);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<Void> deletarEstoques(@PathVariable Long id){
        estoquesRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<EstoquesResponse> atualizarEstoques(@PathVariable Long id, @RequestBody EstoquesRequest estoques){

        Estoques retorno = estoquesRepository.findById(id).map(record ->{
            record.setQuantidade(estoques.getQuantidade());
            record.setProduto(ProdutosMapper.produtosRequestProtudos(estoques.getProduto()));
            record.setLoja(LojasMapper.lojasRequestLojas(estoques.getLoja()));

            return estoquesRepository.save(record);
        }).get();

        EstoquesResponse out = EstoquesMapper.estoquesToEstoquesResponse(retorno);
        return ResponseEntity.ok(out);
    }
}
