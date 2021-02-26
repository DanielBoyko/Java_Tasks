package ClassAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassAssignment1 {
    public char[] getMaxArrChain(char[] initArr) {
        if (initArr.length <= 2) {
            return initArr;
        }

        List<char[]> generatedList = generateAllVariations(initArr);
        char[] maxArr = generatedList.get(0);

        for (int i = 0; i < generatedList.size(); i++) {
            char[] currentArr = generatedList.get(i);
            if(isСonvergence(currentArr)){
                if (validSumElement(maxArr) < validSumElement(currentArr)) {
                    maxArr = currentArr;
                }
            }
        }

        return maxArr;
    }

    private List<char[]> generateAllVariations(char[] arr) {
        List<char[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                result.add(Arrays.copyOfRange(arr, i, j + 1));
            }
        }
        return result;
    }

    private boolean isСonvergence(char[] arr){
        int numCount = 0, charCount = 0;
        for(char element : arr){
            if(Character.isDigit(element)){
                numCount++;
            }else {
                charCount++;
            }
        }
        return numCount == charCount;
    }

    private int validSumElement(char[]arr){
        int numCount = 0;
        for(char element : arr){
            if(Character.isDigit(element)){
                numCount++;
            }
        }
        return numCount;
    }
}
