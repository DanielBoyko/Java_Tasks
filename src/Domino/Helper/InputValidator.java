package Domino.Helper;

import java.util.Scanner;

public class InputValidator {
    public int input(String message, int minValue, int maxValue) {
        Scanner in = new Scanner(System.in);
        int value;
        do {
            System.out.print(message);
            while (!in.hasNextInt()){
                System.out.println("That not a number!");
                in.next();
            }
            value = in.nextInt();
        } while (value < minValue | value > maxValue);
        return value;
    }
}