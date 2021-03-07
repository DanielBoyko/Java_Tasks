package LabWork3.Auth;

public class Validation {
    public static boolean isEmptyOrWhiteSpace(final String string)
    {
        return string != null && !string.isEmpty() && !string.trim().isEmpty();
    }
}
