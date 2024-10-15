package com.imob.exceptions.pessoa;

public class NomePessoaException extends Exception {
    public NomePessoaException() {
        super("O nome da Pessoa não pode ser nulo ou vazio.");
    }
}
