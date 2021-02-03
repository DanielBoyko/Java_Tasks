package LabWork2.StringSorts;

import java.util.Comparator;

public class SortByLength implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return Integer.compare(first.length(),second.length());
    }
}
