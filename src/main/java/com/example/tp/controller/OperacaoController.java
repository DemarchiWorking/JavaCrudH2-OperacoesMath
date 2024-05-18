package com.example.tp.controller;

import com.example.tp.model.Calculo;
import com.example.tp.model.Cliente;
import com.example.tp.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operacao")
public class OperacaoController {

    @GetMapping("sum")
    public double soma(@RequestBody Calculo calculo) {
        return calculo.getSum();
    }

    @GetMapping("sub")
    public double subtracao(@RequestBody Calculo calculo) {
        return calculo.getSub();
    }

    @GetMapping("mul")
    public double mult(@RequestBody Calculo calculo) {
        return calculo.getMul();
    }

    @GetMapping("div")
    public double div(@RequestBody Calculo calculo) {
        return calculo.getDiv();
    }

    @GetMapping("exp")
    public double exp(@RequestBody Calculo calculo) {
        return calculo.getExp();
    }
}

/*
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCliente(@PathVariable int id){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado " + id));
        clienteRepository.delete(cliente);
        return ResponseEntity.ok().build();
        //  return ResponseEntity.ok().build();
    }
    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    // Método para atualizar cliente pelo ID
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable int id, @RequestBody Cliente novoCliente) {
        Cliente clienteExistente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com ID " + id));

        clienteExistente.setNome(novoCliente.getNome());
        Cliente clienteAtualizado = clienteRepository.save(clienteExistente);
        return ResponseEntity.ok(clienteAtualizado);
    }

}
*/