package com.willmadison.javabiography.beans;

import java.util.Collection;

public class Java {

    private final Collection<Bulletpoint> bulletpoints;

    public Java(Collection<Bulletpoint> bulletpoints) {

        this.bulletpoints = bulletpoints;
    }

    public Collection<Bulletpoint> biography() {
        return this.bulletpoints;
    }
}
