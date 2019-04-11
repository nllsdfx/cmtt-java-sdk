package ru.tjournal.api.sdk.exception;

import lombok.Getter;

@Getter
public class ApiException extends Exception {

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
