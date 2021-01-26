package LabWork1;

public class StringUtils {

    /* 19. Створіть метод, який перевертає будь яке слово. Наприклад - на вході травень на виході ьневарт */
    public String ReverseCharAt(String str) {
        if (str == null) {
            throw new NullPointerException("Str is not nothing  referenced");
        }

        String resultStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            resultStr += str.charAt(i);
        }

        return resultStr;
    }

    public String ReverseCharArray(String str) {
        if (str == null) {
            throw new NullPointerException("Str is not nothing  referenced");
        }

        String resultStr = "";
        char[] strArr = str.toCharArray();
        for (int i = strArr.length - 1; i >= 0; i--) {
            resultStr += strArr[i];
        }

        return resultStr;
    }

    public String ReverseMethod(String str) {
        if (str == null) {
            throw new NullPointerException("Str is not nothing  referenced");
        }

        return new StringBuffer(str).reverse().toString();
    }
}
