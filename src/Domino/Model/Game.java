package Domino.Model;


import java.util.*;

public class Game {
    private Deque<Domino> board = new ArrayDeque<>();
    private List<Player> players = new ArrayList<>();
    private List<Domino> market;

    public Game(List<Domino> market, Player... initPlayers) {
        Collections.addAll(players, initPlayers);
        this.market = market;
    }

    //market
    public Domino takeDominoFromMarket(int index) {
        Domino domino = market.get(index);
        market.remove(domino);
        return domino;
    }

    public int marketSize(){
        return market.size();
    }

    //players
    public Player getPlayer(int index){
        return players.get(index);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public int playersCount(){
        return players.size();
    }

    //board
    public Deque<Domino> getBoard(){
        return board;
    }

    public void addFirstToBoard(Domino domino){
        board.addFirst(domino);
    }

    public void addLastToBoard(Domino domino){
        board.addLast(domino);
    }

    public Domino getFirstDominoAtBoard(){
        return board.getFirst();
    }

    public Domino getLastDominoAtBoard(){
        return board.getLast();
    }
}