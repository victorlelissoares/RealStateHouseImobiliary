package com.gm2.realestatehouse.service;

import com.gm2.realestatehouse.dto.ClienteDTO;
import com.gm2.realestatehouse.entity.Cliente;
import com.gm2.realestatehouse.helper.mapper.ClienteMapper;
import com.gm2.realestatehouse.repository.IClienteRepository;
import com.gm2.realestatehouse.service.interfaces.IGenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService implements IGenericService {
    private final IClienteRepository clienteRepository;

    @Override
    public Long create(Object dto) {
        ClienteDTO clienteDTO = (ClienteDTO) dto;
        Cliente cliente = (Cliente) ClienteMapper.toEntity(clienteDTO);
        return clienteRepository.save(cliente).getId();
    }

    @Override
    public List<?> list() {
        return clienteRepository.findAll();
    }

    @Override
    public void delete() {
    }

    @Override
    public Long update() {
        return null;
    }
}
