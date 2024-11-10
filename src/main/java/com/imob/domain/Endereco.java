package com.imob.domain;

import jakarta.persistence.Column;

import java.util.Objects;

public class Endereco {
    private Integer cdEndereco;
    private String dsEndereco;
    private String nrCep;
    private String cidade;
    private String bairro;
    private String estado;

    public Endereco(Integer cdEndereco, String dsEndereco, String nrCep, String cidade, String bairro, String estado) {
        this.cdEndereco = cdEndereco;
        this.dsEndereco = dsEndereco;
        this.nrCep = nrCep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
    }

    public Integer getCdEndereco() {
        return cdEndereco;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public String getNrCep() {
        return nrCep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(cdEndereco, endereco.cdEndereco)
                && Objects.equals(dsEndereco, endereco.dsEndereco)
                && Objects.equals(nrCep, endereco.nrCep)
                && Objects.equals(cidade, endereco.cidade)
                && Objects.equals(bairro, endereco.bairro)
                && Objects.equals(estado, endereco.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdEndereco, dsEndereco, nrCep, cidade, bairro, estado);
    }
}
