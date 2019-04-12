package ru.tjournal.api.sdk.model;

import lombok.Getter;

@Getter
public enum Sign {

    UP(1),
    CANCEL(0),
    DOWN(-1);

    private final int sign;

    Sign(int sign) {
            this.sign = sign;
    }

}
