package Domino.View;


import Domino.Model.Domino;

import java.util.Collection;

public class View {
    public void menuInterface(int marketSize) {
        System.out.println("1. Add dominoes to the beginning of the board");
        System.out.println("2. Add dominoes to the end of the board");
        System.out.println("3. Take dominoes from the market (In stock " + marketSize + ")");
        System.out.println("4. Surrender");
    }

    public void printInfo(String message, Collection<Domino> collection) {
        System.out.print(message);
        for (Domino domino : collection) {
            System.out.print(domino);
        }
        System.out.println();
    }
}