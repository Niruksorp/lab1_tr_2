package ru.sfu.Entity;

public enum EnumAlphabet {
    a(0),
    b(1);

    EnumAlphabet(Integer state) {
        this.state = state;
    }

    private final Integer state;
    public Integer getState() {
        return state;
    }

}
