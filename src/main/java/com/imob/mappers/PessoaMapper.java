package com.imob.mappers;

import com.imob.domain.Pessoa;
import com.imob.entities.PessoaEntity;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PessoaMapper {

    @Named("pessoaToPessoaEntity")
    PessoaEntity pessoaToPessoaEntity(Pessoa pessoa) throws Exception;

    @Named("pessoEntityToPessoa")
    Pessoa pessoaEntityToPessoa(PessoaEntity pessoaEntity) throws Exception;

    @IterableMapping(qualifiedByName = "pessoEntityToPessoa")
    List<Pessoa> pessoEntityListToPessoaList(List<PessoaEntity> pessoas);
}
