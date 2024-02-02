package com.gm2.realestatehouse.dto;

import com.gm2.realestatehouse.entity.enums.EstadoCivil;
import com.gm2.realestatehouse.entity.enums.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record ClienteDTO(
        @NotBlank(message = "Campo nome Inválido: vazio")
        String nome,
        @NotBlank(message = "Campo cpf Inválido: vazio")
        String cpf,
        @NotBlank(message = "Campo telefone Inválido: vazio")
        String telefone,
        @NotBlank(message = "Campo email Inválido: vazio")
        String email,
        @NotNull(message = "Campo sexo Inválido: vazio")
        Sexo sexo,
        @NotNull(message = "Campo estado Inválido: vazio")
        EstadoCivil estadoCivil) {

}
