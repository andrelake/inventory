package com.pospuc.inventory.model;

import com.pospuc.inventory.enums.PermissaoENUM;
import com.pospuc.inventory.enums.StatusENUM;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @Column(name = "usuario")
    private String nome_de_acesso;
    private String senha;
    private String email;

    @Enumerated(EnumType.ORDINAL)
    private PermissaoENUM permissao;

    @Enumerated(EnumType.ORDINAL)
    private StatusENUM status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "setor_id")
    private Setor setor;

}
