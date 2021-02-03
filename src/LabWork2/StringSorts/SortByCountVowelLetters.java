package LabWork2.StringSorts;

import java.util.Comparator;

public class SortByCountVowelLetters implements Comparator<String> {
    char[] engVowelLetters = {'a', 'e', 'i', 'o', 'u', 'y'};

    int getCountVowelLetters(String str) {
        int counter = 0;
        for (char letterFromStr : str.toCharArray()) {
            char lowerLetterFromStr = Character.toLowerCase(letterFromStr);
            for (char vowelLetter : engVowelLetters) {
                if (lowerLetterFromStr == vowelLetter) {
                    counter++;
                }
            }
        }
        return counter;
    }

    @Override
    public int compare(String first, String second) {
        return Integer.compare(getCountVowelLetters(first),getCountVowelLetters(second));
    }
}
