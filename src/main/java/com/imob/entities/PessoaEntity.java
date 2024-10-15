package com.imob.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "pessoa")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_pessoa")
    private Integer cdPessoa;
    @Column(name = "nm_pessoa")
    private String nmPessoa;
    @Column(name = "nr_telefone_1")
    private String nrTelefone1;
    @Column(name = "nr_telefone_2")
    private String nrTelefone2;
    @Column(name = "cd_endereco")
    private Integer cdEndereco;
    @Column(name = "cd_arquivo")
    private Integer cdArquivo;
    @Column(name = "tp_pessoa")
    private Integer tpPessoa;

    public PessoaEntity(Integer cdPessoa, String nmPessoa, String nrTelefone1, String nrTelefone2, Integer cdEndereco, Integer cdArquivo, Integer tpPessoa) {
        this.cdPessoa = cdPessoa;
        this.nmPessoa = nmPessoa;
        this.nrTelefone1 = nrTelefone1;
        this.nrTelefone2 = nrTelefone2;
        this.cdEndereco = cdEndereco;
        this.cdArquivo = cdArquivo;
        this.tpPessoa = tpPessoa;
    }

    public PessoaEntity() {}

    public Integer getCdPessoa() {
        return cdPessoa;
    }

    public void setCdPessoa(Integer cdPessoa) {
        this.cdPessoa = cdPessoa;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }

    public String getNrTelefone1() {
        return nrTelefone1;
    }

    public void setNrTelefone1(String nrTelefone1) {
        this.nrTelefone1 = nrTelefone1;
    }

    public String getNrTelefone2() {
        return nrTelefone2;
    }

    public void setNrTelefone2(String nrTelefone2) {
        this.nrTelefone2 = nrTelefone2;
    }

    public Integer getCdEndereco() {
        return cdEndereco;
    }

    public void setCdEndereco(Integer cdEndereco) {
        this.cdEndereco = cdEndereco;
    }

    public Integer getCdArquivo() {
        return cdArquivo;
    }

    public void setCdArquivo(Integer cdArquivo) {
        this.cdArquivo = cdArquivo;
    }

    public Integer getTpPessoa() {
        return tpPessoa;
    }

    public void setTpPessoa(Integer tpPessoa) {
        this.tpPessoa = tpPessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaEntity that = (PessoaEntity) o;
        return Objects.equals(cdPessoa, that.cdPessoa)
                && Objects.equals(nmPessoa, that.nmPessoa)
                && Objects.equals(nrTelefone1, that.nrTelefone1)
                && Objects.equals(nrTelefone2, that.nrTelefone2)
                && Objects.equals(cdEndereco, that.cdEndereco)
                && Objects.equals(cdArquivo, that.cdArquivo)
                && Objects.equals(tpPessoa, that.tpPessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdPessoa, nmPessoa, nrTelefone1, nrTelefone2, cdEndereco, cdArquivo, tpPessoa);
    }
}
