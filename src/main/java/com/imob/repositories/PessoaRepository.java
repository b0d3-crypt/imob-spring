package com.imob.repositories;

import com.imob.domain.Pessoa;
import com.imob.entities.PessoaEntity;
import com.imob.mappers.PessoaMapper;
import com.imob.repositories.interfaces.IPessoaRepository;
import com.imob.repositories.interfaces.PessoaRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PessoaRepository implements IPessoaRepository {

    @Autowired
    private PessoaRepositoryJPA pessoaRepositoryJPA;
    @Autowired
    private PessoaMapper pessoaMapper;


    @Override
    public Pessoa insert(Pessoa pessoa) throws Exception {
        PessoaEntity pessoaEntity = pessoaMapper.pessoaToPessoaEntity(pessoa);
        pessoaEntity = pessoaRepositoryJPA.save(pessoaEntity);
        return pessoaMapper.pessoaEntityToPessoa(pessoaEntity);
    }

    @Override
    public Pessoa update(Pessoa pessoa) throws Exception {
        PessoaEntity pessoaEntity = pessoaMapper.pessoaToPessoaEntity(pessoa);
        pessoaEntity = pessoaRepositoryJPA.save(pessoaEntity);
        return pessoaMapper.pessoaEntityToPessoa(pessoaEntity);
    }

    @Override
    public Pessoa get(Integer cdPessoa) throws Exception {
        Optional<PessoaEntity> pessoaEntity = pessoaRepositoryJPA.getByCdPessoa(cdPessoa);
        if(pessoaEntity.isPresent()) {
            return pessoaMapper.pessoaEntityToPessoa(pessoaEntity.get());
        }
        return null;
    }

    @Override
    public List<Pessoa> getAll() throws Exception {
        List<PessoaEntity> pessoaEntity = pessoaRepositoryJPA.findAll();
        return pessoaMapper.pessoEntityListToPessoaList(pessoaEntity);
    }
}
