package com.gm2.realestatehouse.controller;

import com.gm2.realestatehouse.dto.ClienteDTO;
import com.gm2.realestatehouse.service.ClienteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<?>> list (){
        return ResponseEntity.ok(clienteService.list());
    }

    @PostMapping
    public ResponseEntity<Long> create(@Valid @RequestBody ClienteDTO clienteDTO){
        return ResponseEntity.ok(clienteService.create(clienteDTO));
    }

    @DeleteMapping("/{idCliente}")
    public ResponseEntity<Void> delete (@Valid @PathVariable Long idCliente){
        clienteService.delete(idCliente);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> update (@Valid @RequestBody ClienteDTO clienteDTO){
        clienteService.update(clienteDTO);
        return ResponseEntity.ok().build();
    }
}
