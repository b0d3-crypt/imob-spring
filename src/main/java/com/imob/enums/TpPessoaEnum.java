package com.imob.enums;

import java.util.HashMap;
import java.util.Map;

public enum TpPessoaEnum {
    FISICA(1, "FÍSICA"),
    JURIDICA(2, "JURÍDICA");

    private final int valor;
    private final String descricao;
    private static final Map<Integer, TpPessoaEnum> map = new HashMap<>();

    static {
        for (TpPessoaEnum tipo : TpPessoaEnum.values()) {
            map.put(tipo.getValor(), tipo);
        }
    }

    TpPessoaEnum(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TpPessoaEnum map(int valor) {
        return map.get(valor);
    }
}
