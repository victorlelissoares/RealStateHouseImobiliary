package com.gm2.realestatehouse.helper.mapper;

import com.gm2.realestatehouse.dto.ClienteDTO;
import com.gm2.realestatehouse.entity.Cliente;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteMapper {

    public static Object toDTO(Object object) {
        Cliente cliente = ((Cliente) object);
        return ClienteDTO.builder()
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
                .telefone(cliente.getTelefone())
                .email(cliente.getEmail())
                .sexo(cliente.getSexo())
                .build();
    }

    public static Object toEntity(Object object) {
        ClienteDTO clienteDTO = ((ClienteDTO) object);
        return Cliente.builder()
                .nome(clienteDTO.nome())
                .cpf(clienteDTO.cpf())
                .telefone(clienteDTO.telefone())
                .email(clienteDTO.email())
                .sexo(clienteDTO.sexo())
                .estadoCivil(clienteDTO.estadoCivil())
                .build();
    }

    public static List<Object> toDTO(List<Object> listObject){
        List<ClienteDTO> clienteDTOList =
                listObject.
                        stream().
                        map(ClienteMapper::toDTO).
                        map(a -> (ClienteDTO)a).
                        toList();
        return Collections.singletonList(clienteDTOList);
    }
}
