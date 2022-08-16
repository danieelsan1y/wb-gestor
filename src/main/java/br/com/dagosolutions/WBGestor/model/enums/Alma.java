package br.com.dagosolutions.WBGestor.model.enums;

public enum Alma {
    LISA(0),
    RAIADA(1);

    private int code;
    private Alma(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Alma valueOf(int code) {
        for (Alma value : Alma.values()) {
            if (value.getCode() == code) {
                return value;
            }

        }
        throw new IllegalArgumentException("Invalid Order Status code!");
    }
}
