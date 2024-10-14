package com.imob.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pessoa {
    private Integer id;
    private String nmPessoa;
    private String nrTelefone1;
    private String nrTelefone2;
    private Integer cdEndereco;
    private Integer cdArquivo;
    private Integer tpPessoa;
}
