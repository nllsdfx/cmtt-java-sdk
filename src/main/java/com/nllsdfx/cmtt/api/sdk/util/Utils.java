package com.nllsdfx.cmtt.api.sdk.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Utils {

    public static ParameterizedType buildParametrizedType(Type raw, Type... typeArguments) {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return typeArguments;
            }

            @Override
            public Type getRawType() {
                return raw;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        };
    }
}
