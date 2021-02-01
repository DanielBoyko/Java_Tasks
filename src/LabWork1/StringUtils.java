package LabWork1;

public class StringUtils {

    /* 19. Створіть метод, який перевертає будь яке слово. Наприклад - на вході травень на виході ьневарт */
    public String ReverseUsingCharAt(String str) {
        if (str == null) {
            throw new NullPointerException("Str is not nothing  referenced");
        }

        StringBuilder resultStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            resultStr.append(str.charAt(i));
        }

        return resultStr.toString();
    }

    public String ReverseUsingCharArray(String str) {
        if (str == null) {
            throw new NullPointerException("Str is not nothing  referenced");
        }

        StringBuilder resultStr = new StringBuilder();
        char[] strArr = str.toCharArray();
        for (int i = strArr.length - 1; i >= 0; i--) {
            resultStr.append(strArr[i]);
        }

        return resultStr.toString();
    }

    public String ReverseUsingMethod(String str) {
        if (str == null) {
            throw new NullPointerException("Str is not nothing  referenced");
        }

        return new StringBuffer(str).reverse().toString();
    }
}
