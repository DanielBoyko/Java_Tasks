package LabWork2.StringSorts;

import java.util.Comparator;

public class SortByThirdSymbol implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        if (first.length() < 3 | second.length() < 3) {
            throw new IllegalArgumentException("String length must be greater than or equal 3");
        }
        return Character.compare(first.charAt(2), second.charAt(2));
    }
}
