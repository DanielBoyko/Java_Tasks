package LabWork1;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayUtils {

    /* 3. Створіть метод, який дозволяє вставляти в будь яку позицію
    масиву будь яке число. Метод повинен повертати новий масив. */
    public int[] Insert(int[] arr, int index, int insertionValue) {
        if (arr == null) {
            throw new NullPointerException("Array is not nothing  referenced");
        }

        if (index < 0 || index > arr.length) {
            throw new ArrayIndexOutOfBoundsException("The index to insert is out of bounds of the array");
        }

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        for (int i = arr.length; i > index; i--) {
            newArr[i] = arr[i - 1];
        }
        newArr[index] = insertionValue;

        return newArr;
    }

    /* 5. Створіть метод, який дозволяє видаляти всі елементи в масиві int[] , які мають певне
    значення, наприклад дорівнюються 23. Масив без видалених елементів повинен повертатися,
    як результат роботи методу. */
    public int[] RemoveAllDefinedValues(int[] arr, int valueToRemove) {
        if (arr == null) {
            throw new NullPointerException("Array is not nothing  referenced");
        }

        int countRemovedElements = 0;
        for (int element : arr) {
            if (element == valueToRemove) {
                countRemovedElements++;
            }
        }

        if (countRemovedElements == 0) {
            return arr;
        }

        int[] newArr = new int[arr.length - countRemovedElements];
        int startIndex = 0;
        for (int element : arr) {
            if (element != valueToRemove) {
                newArr[startIndex++] = element;
            }
        }

        return newArr;
    }

    public int[] RemoveAllDefinedValuesWithStream(int[] arr, int valueToRemove) {
        return Arrays.stream(arr).filter(value -> value != valueToRemove).toArray();
    }

    /* 8. Створіть метод, який підраховує кількість однакових чисел у будь якому масиві int[].
    Приклад [1,7,3,9,34,3,7] Результат :  1- 1раз, 7 - 2 рази,3-2 рази…. */
    public HashMap<Integer, Integer> CountOfRepetitions(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Array is not nothing  referenced");
        }

        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for (int element : arr) {
            int count = counter.getOrDefault(element, 0);
            counter.put(element, ++count);
        }

        return counter;
    }

    /* 29. Створіть метод, який приймає будь-яку кількість масивів int[] та повертає
    найменше число яке є у складі цих масивів */
    public int ArraysMinimumValue(int[]... arrays) {
        if (arrays.length == 0) {
            throw new IllegalArgumentException("You passed an empty parameter");
        }

        int min = arrays[0][0];
        for (int[] array : arrays) {
            for (int element : array) {
                if (element < min) {
                    min = element;
                }
            }
        }

        return min;
    }
}
