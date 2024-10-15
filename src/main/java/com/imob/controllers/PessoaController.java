package com.imob.controllers;

import com.imob.domain.Pessoa;
import com.imob.repositories.interfaces.IPessoaRepository;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    private final IPessoaRepository pessoaRepository;

    public PessoaController(IPessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca efetuada com sucesso."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @Operation(description = "Busca por dados de maquinas agricolas dos sites indexados.")
    public List<Pessoa> getAll() throws Exception {
        try {
            return pessoaRepository.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Houve um erro ao buscar os dados das máquinas");
        }
    }

    @PostMapping
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca efetuada com sucesso."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @Operation(description = "Busca por dados de maquinas agricolas dos sites indexados.")
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) throws Exception {
        try {
            return pessoaRepository.insert(pessoa);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Houve um erro ao buscar os dados das máquinas");
        }
    }
}
