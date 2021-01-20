package LabWork1Test;

import LabWork1.ArrayUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

class ArrayUtilsTest {

    @Test
    void insert() {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[] arr = {1, 2, 3};
        int[] actual = arrayUtils.Insert(arr, 1, 10);
        int[] expected = {1, 10, 2, 3};

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    void removeAllDefinedValues() {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[] arr = {1, 2, 3, 4, 3, 5};
        int[] actual = arrayUtils.RemoveAllDefinedValues(arr, 3);
        int[] expected = {1, 2, 4, 5};

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    void countOfRepetitions() {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[] arr = {1, 2, 3, 3, 4, 1, 3};
        var actual = arrayUtils.CountOfRepetitions(arr);
        var expected = new HashMap<Integer, Integer>();
        expected.put(1, 2);
        expected.put(2, 1);
        expected.put(3, 3);
        expected.put(4, 1);

        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    void arraysMinimumValue() {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {-2, 3, 4};
        int actual = arrayUtils.ArraysMinimumValue(arr1, arr2);
        int expected = -2;

        Assert.assertEquals(actual, expected);
    }
}