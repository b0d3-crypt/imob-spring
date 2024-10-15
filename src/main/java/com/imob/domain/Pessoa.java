package com.imob.domain;

public class Pessoa {
    private Integer cdPessoa;
    private String nmPessoa;
    private String nrTelefone1;
    private String nrTelefone2;
    private Integer cdEndereco;
    private Integer cdArquivo;
    private Integer tpPessoa;

    public Pessoa(Integer cdPessoa, String nmPessoa, String nrTelefone1, String nrTelefone2, Integer cdEndereco, Integer cdArquivo, Integer tpPessoa) {
        this.cdPessoa = cdPessoa;
        this.nmPessoa = nmPessoa;
        this.nrTelefone1 = nrTelefone1;
        this.nrTelefone2 = nrTelefone2;
        this.cdEndereco = cdEndereco;
        this.cdArquivo = cdArquivo;
        this.tpPessoa = tpPessoa;
    }

    public Integer getCdPessoa() {
        return cdPessoa;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public String getNrTelefone1() {
        return nrTelefone1;
    }

    public String getNrTelefone2() {
        return nrTelefone2;
    }

    public Integer getCdEndereco() {
        return cdEndereco;
    }

    public Integer getCdArquivo() {
        return cdArquivo;
    }

    public Integer getTpPessoa() {
        return tpPessoa;
    }
}
