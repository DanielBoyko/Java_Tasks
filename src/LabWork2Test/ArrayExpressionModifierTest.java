package LabWork2Test;

import LabWork2.ArrayExpressionModifier;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ArrayExpressionModifierTest {
    private ArrayExpressionModifier arrayModifier = new ArrayExpressionModifier();

    @ParameterizedTest
    @MethodSource("method1DataProvider")
    void modifyArrayUsingFunctionExpression(int[] actual, int[] expected) {
        arrayModifier.modifyArrayUsingFunctionExpression(actual, x -> x * 2);
        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> method1DataProvider() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, new int[]{2, 4, 6}),
                arguments(null, null)
        );
    }
}