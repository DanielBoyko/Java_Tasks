package LabWork1;

public class StringManager {

    /* 19. Створіть метод, який перевертає будь яке слово. Наприклад - на вході травень на виході ьневарт */
    public String Reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
