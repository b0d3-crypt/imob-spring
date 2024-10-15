package com.imob.exceptions;

public class CodigoEnderecoException extends Exception {
    public CodigoEnderecoException() {
        super("O código do endereço deve ser válido.");
    }
}
