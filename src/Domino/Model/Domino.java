package Domino.Model;

public class Domino {
    private int leftValue;
    private int rightValue;

    public Domino(int leftValue, int rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public void swapSides() {
        int temp = leftValue;
        leftValue = rightValue;
        rightValue = temp;
    }

    public int getRightValue() {
        return rightValue;
    }

    public int getLeftValue() {
        return leftValue;
    }

    public boolean isMirror(int num) {
        return leftValue == num & rightValue == num;
    }

    public int getSumBothSides() {
        return leftValue + rightValue;
    }

    @Override
    public String toString() {
        return "|" + leftValue + "||" + rightValue + "| ";
    }
}