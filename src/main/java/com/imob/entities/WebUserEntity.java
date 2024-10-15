package com.imob.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "web_user")
public class WebUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_web_user")
    private Integer id;
    @Column(name = "cd_pessoa", nullable = false)
    private Integer cdPessoa;
    @Column(name = "nm_login", nullable = false)
    private String login;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "tp_responsabilidade")
    private Integer tpResponsabilidade;
}
