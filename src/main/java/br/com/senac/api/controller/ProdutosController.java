package br.com.senac.api.controller;

import br.com.senac.api.entidades.Produtos;
import br.com.senac.api.repositorios.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produtos")
@CrossOrigin
public class ProdutosController {

    @Autowired
    private ProdutosRepository produtosRepository;

    @PostMapping("/")
    @CrossOrigin
    public ResponseEntity<Produtos> criarProdutos(@RequestBody Produtos produtos){
        Produtos retorno = produtosRepository.save(produtos);

        return ResponseEntity.status(HttpStatus.CREATED).body(retorno);
    }
    @GetMapping("/")
    @CrossOrigin
    public ResponseEntity<List<Produtos>> carregarProdutos(){
        List<Produtos> retorno = produtosRepository.findAll();
        return ResponseEntity.ok(retorno);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<Void> deletarProdutos(@PathVariable Long id){
        produtosRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<Produtos> atualizarProdutos(@PathVariable Long id, @RequestBody Produtos produtos){

        Produtos retorno = produtosRepository.findById(id).map(record ->{
            record.setNome(produtos.getNome());
            record.setCodigoEan(produtos.getCodigoEan());
            record.setDescricao(produtos.getDescricao());
            return produtosRepository.save(record);
        }).get();
        return ResponseEntity.ok(retorno);
    }
}

