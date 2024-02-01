package com.gm2.realestatehouse.dto;

import com.gm2.realestatehouse.entity.enums.EstadoCivil;
import com.gm2.realestatehouse.entity.enums.Sexo;
import lombok.Builder;

@Builder
public record ClienteDTO(
        String nome,
        String cpf,
        String telefone,
        String email,
        Sexo sexo,
        EstadoCivil estadoCivil) {

}
