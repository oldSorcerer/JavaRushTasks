package com.javarush.task.pro.task13.task1336;

import java.util.HashMap;
import java.util.Map;

public enum Error {
    NETWORK_ERROR(100),
    SYSTEM_ERROR(200),
    COMPILATION_ERROR(300);

    private final int errorCode;

    private static final Map<Integer, Error> errorMap = new HashMap<>();

    static {
        for (Error error : Error.values()) {
            errorMap.put(error.getErrorCode(), error);
        }
    }

    Error(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public static Error getErrorByID(Integer errorNumber) {
        return errorMap.get(errorNumber);
    }

    public Map<Integer, Error> getErrorMap() { return errorMap; }
}
