package com.gm2.realestatehouse.entity.enums;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public enum Sexo {
    MASCULINO,
    FEMININO,
    OUTRO
}
