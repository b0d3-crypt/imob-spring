package com.imob.domain;

import com.imob.exceptions.CodigoEnderecoException;
import com.imob.exceptions.pessoa.NomePessoaException;
import com.imob.exceptions.pessoa.TipoPessoaException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PessoaTest {

    @Test
    @DisplayName("Teste de criação do objeto com nome vazio")
    public void criaObjetoNomeVazio()  {
        assertThrows(NomePessoaException.class, () -> new Pessoa(null,
                "",
                null,
                null,
                1,
                null,
                1));
    }

    @Test
    @DisplayName("Teste de criação do objeto com nome nulo")
    public void criaObjetoNomeNulo()  {
        assertThrows(NomePessoaException.class, () -> new Pessoa(null,
                null,
                null,
                null,
                1,
                null,
                1));
    }

    @Test
    @DisplayName("Teste de criação do objeto com código do endereço nulo")
    public void criaObjetoCodigoEnderecoNulo()  {
        assertThrows(CodigoEnderecoException.class, () -> new Pessoa(null,
                "pessoa",
                null,
                null,
                null,
                null,
                1));
    }

    @Test
    @DisplayName("Teste de criação do objeto com código do endereço invalido")
    public void criaObjetoCodigoEnderecoInvalido()  {
        assertThrows(CodigoEnderecoException.class, () -> new Pessoa(null,
                "pessoa",
                null,
                null,
                0,
                null,
                1));
    }

    @Test
    @DisplayName("Teste de criação do objeto com tipo da pessoa nulo")
    public void criaObjetoTipoPessoaNulo()  {
        assertThrows(TipoPessoaException.class, () -> new Pessoa(null,
                "pessoa",
                null,
                null,
                1,
                null,
                null));
    }

    @Test
    @DisplayName("Teste de criação do objeto com tipo da pessoa invalido")
    public void criaObjetoTipoPessoaInvalido()  {
        assertThrows(TipoPessoaException.class, () -> new Pessoa(null,
                "pessoa",
                null,
                null,
                1,
                null,
                3));
    }
}
