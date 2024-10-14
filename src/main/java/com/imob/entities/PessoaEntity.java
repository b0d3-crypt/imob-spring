package com.imob.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pessoa")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_pessoa")
    private Integer cdPessoa;
    @Column(name = "nm_pessoa")
    private String nmPessoa;
    @Column(name = "nr_telefone_1")
    private String nrTelefone1;
    @Column(name = "nr_telefone_2")
    private String nrTelefone2;
    @Column(name = "cd_endereco")
    private Integer cdEndereco;
    @Column(name = "cd_arquivo")
    private Integer cdArquivo;
    @Column(name = "tp_pessoa")
    private Integer tpPessoa;
}
