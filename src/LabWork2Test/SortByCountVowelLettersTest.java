package LabWork2Test;

import LabWork2.StringSorts.SortByCountVowelLetters;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SortByCountVowelLettersTest {

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void sortByCountVowelLetters(String[] initialArr, String[] expectedArr) {
        if (initialArr == null) {
            Throwable thrown = assertThrows(NullPointerException.class, () -> {
                Arrays.sort(initialArr, new SortByCountVowelLetters());
            });
            assertNotNull(thrown.getMessage());
        } else {
            Arrays.sort(initialArr, new SortByCountVowelLetters());
            assertArrayEquals(expectedArr, initialArr);
        }
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[]{"daeo", "ssa", "ddii"}, new String[]{"ssa", "ddii", "daeo"}),
                arguments(new String[]{"", "saaa", "ddi"}, new String[]{"", "ddi", "saaa"}),
                arguments(null, null)
        );
    }
}