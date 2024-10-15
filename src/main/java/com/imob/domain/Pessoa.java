package com.imob.domain;

import com.imob.enums.TpPessoaEnum;
import com.imob.exceptions.CodigoEnderecoException;
import com.imob.exceptions.pessoa.NomePessoaException;
import com.imob.exceptions.pessoa.TipoPessoaException;

public class Pessoa {
    private Integer cdPessoa;
    private String nmPessoa;
    private String nrTelefone1;
    private String nrTelefone2;
    private Integer cdEndereco;
    private Integer cdArquivo;
    private Integer tpPessoa;

    public Pessoa(Integer cdPessoa,
                  String nmPessoa,
                  String nrTelefone1,
                  String nrTelefone2,
                  Integer cdEndereco,
                  Integer cdArquivo,
                  Integer tpPessoa) throws Exception {
        this.cdPessoa = cdPessoa;
        this.nmPessoa = nmPessoa;
        this.nrTelefone1 = nrTelefone1;
        this.nrTelefone2 = nrTelefone2;
        this.cdEndereco = cdEndereco;
        this.cdArquivo = cdArquivo;
        this.tpPessoa = tpPessoa;
        validar();
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

    private void validar() throws Exception {
        validarNmPessoa();
        validarCdEndereco();
        validarTpPessoa();
    }

    private void validarNmPessoa() throws Exception {
        if(nmPessoa == null || nmPessoa.trim().isEmpty()) {
            throw new NomePessoaException();
        }
    }

    private void validarCdEndereco() throws Exception {
        if(cdEndereco == null || cdEndereco == 0) {
            throw new CodigoEnderecoException();
        }
    }

    private void validarTpPessoa() throws Exception {
        if(tpPessoa == null || tpPessoa != TpPessoaEnum.FISICA.getValor()
                && tpPessoa != TpPessoaEnum.JURIDICA.getValor()) {
            throw new TipoPessoaException();
        }
    }
}
