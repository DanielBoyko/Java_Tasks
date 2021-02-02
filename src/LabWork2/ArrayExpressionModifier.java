package LabWork2;

import java.util.function.Function;

public class ArrayExpressionModifier {
    /* 35. Створіть метод, який дозволяє модифікувати елементи будь якого масиву int[],
    використовуючи кожний елемент масиву , як аргумент певної функції( f(x)=3*x*x+5*x-21 наприклад).
    Масив  та функція передаються як параметри методу. */
    public void modifyArrayUsingFunctionExpression(int[] arr, Function<Integer, Integer> func) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = func.apply(arr[i]);
        }
    }
}
