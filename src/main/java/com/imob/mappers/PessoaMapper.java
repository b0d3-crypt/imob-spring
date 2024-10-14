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
    PessoaEntity pessoaToPessoaEntity(Pessoa pessoa);

    @Named("pessoEntityToPessoa")
    Pessoa pessoaEntityToPessoa(PessoaEntity pessoaEntity);

    @IterableMapping(qualifiedByName = "pessoEntityToPessoa")
    List<Pessoa> pessoEntityListToPessoaList(List<PessoaEntity> pessoas);
}
