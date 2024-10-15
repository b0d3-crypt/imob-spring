package com.imob.exceptions.pessoa;

public class TipoPessoaException extends Exception {
    public TipoPessoaException() {
        super("O tipo da pessoa deve ser válido.");
    }
}
