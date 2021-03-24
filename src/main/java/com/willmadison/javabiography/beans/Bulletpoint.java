package com.willmadison.javabiography.beans;

public class Bulletpoint {

    private final String value;

    public Bulletpoint(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("* %s", this.value);
    }
}
