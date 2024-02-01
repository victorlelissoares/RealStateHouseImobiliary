package com.gm2.realestatehouse.entity.enums;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
public enum EstadoCivil {
    SOLTEIRO,
    CASADO,
    DIVORCIADO,
    VIUVO
}
