package LabWork2;

import LabWork2.StringSorts.SortByCountVowelLetters;
import LabWork2.StringSorts.SortByLength;
import LabWork2.StringSorts.SortByThirdSymbol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //2
        int[] numArr = {1, 2, 3};
        ArrayExpressionModifier arrayExpressionModifier = new ArrayExpressionModifier();
        arrayExpressionModifier.modifyArrayUsingFunctionExpression(numArr, x -> 3 * x * x);
        System.out.println("Array after modification");
        for (int item : numArr) {
            System.out.println(item);
        }
        //3
        String[] strArr = {"qwerty", "array", "GitHub"};
        System.out.println("Initial array");
        for(String str: strArr){
            System.out.println(str);
        }
        System.out.println("Sort by length");
        Arrays.sort(strArr, new SortByLength());
        for(String str: strArr){
            System.out.println(str);
        }
        System.out.println("Sort by third symbol");
        Arrays.sort(strArr, new SortByThirdSymbol());
        for(String str: strArr){
            System.out.println(str);
        }
        System.out.println("Sort by count vowel letters");
        Arrays.sort(strArr, new SortByCountVowelLetters());
        for(String str: strArr){
            System.out.println(str);
        }
        //5
        Position position = Position.DIRECTOR;
        System.out.println(position);
        position.setSalary(3000);
        position.setNumberOfVacationDays(15);
        System.out.println(position);
    }
}
