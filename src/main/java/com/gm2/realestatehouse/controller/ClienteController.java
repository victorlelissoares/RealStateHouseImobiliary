package com.gm2.realestatehouse.controller;

import com.gm2.realestatehouse.dto.ClienteDTO;
import com.gm2.realestatehouse.helper.mapper.ClienteMapper;
import com.gm2.realestatehouse.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> list (){
        return ResponseEntity.ok((List<ClienteDTO>) ClienteMapper.toDTO(clienteService.list()));
    }

    @PostMapping
    public ResponseEntity<Long> create(@RequestBody ClienteDTO clienteDTO){
        return ResponseEntity.ok(clienteService.create(clienteDTO));
    }

}
