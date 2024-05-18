package com.example.tp.controller;

import com.example.tp.model.Cliente;
import com.example.tp.repository.ClienteRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

   // public ClienteController(ClienteRepository clienteRepository) {
    //    this.clienteRepository = clienteRepository;}
    @GetMapping
    public List<Cliente> getAllClientes()
    {
        return clienteRepository.findAll();
    }
    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable int id)
    {
        return clienteRepository.findById(id).orElseThrow(() ->  new RuntimeException("Cliente não encontrado com id " +  id));
    }

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
