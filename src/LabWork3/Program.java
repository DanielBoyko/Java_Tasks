package LabWork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        int[] arrInt = {-2, -2, -3, 1};
        int[] maxChain = program.getMaxArrChain(arrInt);
        System.out.println(Arrays.toString(maxChain));
    }

    public int[] getMaxArrChain(int[] initArr) {
        if (initArr.length <= 2) {
            return initArr;
        }

        List<int[]> generatedList = generateAllVariations(initArr);
        int[] maxArr = generatedList.get(0);
        for (int i = 0; i < generatedList.size(); i++) {
            int[] currentArr = generatedList.get(i);
            if (sumArrElement(maxArr) < sumArrElement(currentArr)) {
                maxArr = currentArr;
            }
        }

        return maxArr;
    }

    private List<int[]> generateAllVariations(int[] arr) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                result.add(Arrays.copyOfRange(arr, i, j + 1));
            }
        }
        return result;
    }

    private int sumArrElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}