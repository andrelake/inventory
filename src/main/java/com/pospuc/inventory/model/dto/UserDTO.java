package com.pospuc.inventory.model.dto;

import com.pospuc.inventory.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class UserDTO {

    @NotNull
    private String nome;
    @NotNull
    private String email;
    @NotNull
    private Integer permissao;
    @NotNull
    private Integer status;
    @NotNull
    private String setor;

    public UserDTO(User user) {
        this.nome = user.getNome();
        this.email = user.getEmail();
        this.permissao = user.getPermissao().getCodigo();
        this.status = user.getStatus().getCodigo();
        this.setor = user.getSetor().getDescricao();
    }
}
