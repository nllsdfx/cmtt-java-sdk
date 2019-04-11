package ru.tjournal.api.sdk.util;

public final class StringUtils {

    private StringUtils() {
    }

    public static boolean isBlank(final String string) {
        return string == null || string.trim().isEmpty();
    }
}
