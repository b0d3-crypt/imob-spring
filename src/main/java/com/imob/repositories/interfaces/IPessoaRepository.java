package com.imob.repositories.interfaces;

import com.imob.domain.Pessoa;

import java.util.List;

public interface IPessoaRepository {

    Pessoa insert(Pessoa pessoa) throws Exception;
    Pessoa update(Pessoa pessoa) throws Exception;
    Pessoa get(Integer cdPessoa) throws Exception;
    List<Pessoa> getAll() throws Exception;
}
