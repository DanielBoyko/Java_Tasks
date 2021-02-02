package Domino.Model;


import java.util.ArrayList;
import java.util.List;

public class Player {
    public final String name;
    private List<Domino> playerDominoes = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addDomino(Domino domino) {
        playerDominoes.add(domino);
    }

    public Domino getDomino(int index) {
        return playerDominoes.get(index);
    }

    public void removeDomino(Domino domino) {
        playerDominoes.remove(domino);
    }

    public List<Domino> getAllDominoes() {
        return playerDominoes;
    }

    public int dominoesSize() {
        return playerDominoes.size();
    }
}