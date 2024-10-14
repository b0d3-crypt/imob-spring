package com.imob.repositories.interfaces;

import com.imob.entities.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepositoryJPA extends JpaRepository<PessoaEntity, Integer> {
    Optional<PessoaEntity> getByCdPessoa(Integer cdPessoa);
}
