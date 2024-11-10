package com.imob.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "endereco")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_endereco")
    private Integer cdEndereco;
    @Column(name = "ds_endereco")
    private String dsEndereco;
    @Column(name = "nr_cep")
    private String nrCep;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "estado")
    private String estado;

    public EnderecoEntity(Integer cdEndereco, String dsEndereco, String nrCep, String cidade, String bairro, String estado) {
        this.cdEndereco = cdEndereco;
        this.dsEndereco = dsEndereco;
        this.nrCep = nrCep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
    }

    public EnderecoEntity() {}

    public Integer getCdEndereco() {
        return cdEndereco;
    }

    public void setCdEndereco(Integer cdEndereco) {
        this.cdEndereco = cdEndereco;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    public String getNrCep() {
        return nrCep;
    }

    public void setNrCep(String nrCep) {
        this.nrCep = nrCep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoEntity that = (EnderecoEntity) o;
        return Objects.equals(cdEndereco, that.cdEndereco)
                && Objects.equals(dsEndereco, that.dsEndereco)
                && Objects.equals(nrCep, that.nrCep)
                && Objects.equals(cidade, that.cidade)
                && Objects.equals(bairro, that.bairro)
                && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdEndereco, dsEndereco, nrCep, cidade, bairro, estado);
    }
}
