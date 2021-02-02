package LabWork2.StringSorts;

import java.util.Comparator;

public class SortByLength implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        Integer firstLength = first.length();
        Integer secondLength = second.length();
        return firstLength.compareTo(secondLength);
    }
}
