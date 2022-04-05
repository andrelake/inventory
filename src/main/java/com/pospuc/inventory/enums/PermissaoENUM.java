package com.pospuc.inventory.enums;

import lombok.Getter;

@Getter
public enum PermissaoENUM {

    ADMIN(1),
    OUTROS(2);

    private Integer codigo;

    PermissaoENUM(Integer codigo) {
        this.codigo = codigo;
    }
}
