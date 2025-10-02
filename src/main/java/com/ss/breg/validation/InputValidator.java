package com.ss.breg.validation;

public class InputValidator {
    public static boolean isEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static boolean hasEmpty(String... fields) {
        for (String field : fields) {
            if (isEmpty(field)) {
                return true;
            }
        }
        return false;
    }
}
