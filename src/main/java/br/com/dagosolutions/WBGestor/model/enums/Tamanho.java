package br.com.dagosolutions.WBGestor.model.enums;

public enum Tamanho {
    CURTA(0),
    LONGA(1);

    private int code;
    private Tamanho(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Tamanho valueOf(int code) {
        for (Tamanho value : Tamanho.values()) {
            if (value.getCode() == code) {
                return value;
            }

        }
        throw new IllegalArgumentException("Invalid Order Status code!");
    }
}
