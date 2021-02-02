package Domino;

import Domino.Controller.GameController;
import Domino.Model.Player;

public class Program {
    public static void main(String[] args) {
        Player player1 = new Player("Steve");
        Player player2 = new Player("Oscar");
        Player player3 = new Player("Tony");
        Player player4 = new Player("Usagi");
        GameController gameController = new GameController(player1, player2);
        gameController.startGame();
    }
}
