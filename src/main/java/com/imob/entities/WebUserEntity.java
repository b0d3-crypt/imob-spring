package com.imob.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "web_user")
public class WebUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_web_user")
    private Integer cdWebUser;
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

    public WebUserEntity(Integer cdWebUser, Integer cdPessoa, String login, String password, String email, Integer tpResponsabilidade) {
        this.cdWebUser = cdWebUser;
        this.cdPessoa = cdPessoa;
        this.login = login;
        this.password = password;
        this.email = email;
        this.tpResponsabilidade = tpResponsabilidade;
    }

    public WebUserEntity() {}

    public Integer getCdWebUser() {
        return cdWebUser;
    }

    public void setCdWebUser(Integer cdWebUser) {
        this.cdWebUser = cdWebUser;
    }

    public Integer getCdPessoa() {
        return cdPessoa;
    }

    public void setCdPessoa(Integer cdPessoa) {
        this.cdPessoa = cdPessoa;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTpResponsabilidade() {
        return tpResponsabilidade;
    }

    public void setTpResponsabilidade(Integer tpResponsabilidade) {
        this.tpResponsabilidade = tpResponsabilidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebUserEntity that = (WebUserEntity) o;
        return Objects.equals(cdWebUser, that.cdWebUser)
                && Objects.equals(cdPessoa, that.cdPessoa)
                && Objects.equals(login, that.login)
                && Objects.equals(password, that.password)
                && Objects.equals(email, that.email)
                && Objects.equals(tpResponsabilidade, that.tpResponsabilidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdWebUser, cdPessoa, login, password, email, tpResponsabilidade);
    }
}
