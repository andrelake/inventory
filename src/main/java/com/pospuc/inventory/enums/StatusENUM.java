package com.pospuc.inventory.enums;

import lombok.Getter;

@Getter
public enum StatusENUM {

    ATIVO(1),
    INATIVO(2);

    private Integer codigo;

    StatusENUM(Integer codigo) {
        this.codigo = codigo;
    }
}
