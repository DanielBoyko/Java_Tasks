package Domino.Controller;

import Domino.Helper.InputValidator;
import Domino.Model.*;
import Domino.View.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameController {
    private View view = new View();
    private Game game;

    public GameController(Player player1, Player player2) {
        game = new Game(generateMarket(),player1, player2);
        initDominoesToAllPlayers(7);
    }

    public GameController(Player player1, Player player2, Player player3, Player player4) {
        game = new Game(generateMarket(), player1, player2, player3, player4);
        initDominoesToAllPlayers(5);
    }

    private List<Domino> generateMarket() {
        List<Domino> marketFromGenerator = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                marketFromGenerator.add(new Domino(i, j));
            }
        }

        return marketFromGenerator;
    }

    private void initDominoesToAllPlayers(int numberOfDominoesToIssued) {
        for (int i = 0; i < game.playersCount(); i++) {
            Player player = game.getPlayer(i);
            for (int j = 0; j < numberOfDominoesToIssued; j++) {
                player.addDomino(takeRandomDominoFromMarket());
            }
        }
    }

    private Domino takeRandomDominoFromMarket() {
        return game.takeDominoFromMarket(new Random().nextInt(game.marketSize()));
    }

    public void startGame() {
        System.out.println(findPlayerWithMaxDominoAndThrowMaxDominoToBoard().name
                + " successfully started the game!");

        while (true) {
            for (int i = 0; i < game.playersCount(); i++) {
                Player player = game.getPlayer(i);

                if (!isMovePossible(player) & game.marketSize() == 0) {
                    System.out.println(player.name + " lost because he cannot make a move");
                    game.removePlayer(player);
                    continue;
                }

                if (game.playersCount() == 1) {
                    System.out.println(game.getPlayer(0).name + " won:)");
                    return;
                }

                menuFunctionality(player);
            }
        }
    }

    private void menuFunctionality(Player player) {
        InputValidator inputValidator = new InputValidator();
        view.printInfo("Board: ", game.getBoard());
        view.printInfo(player.name + "'s dominoes: ", player.getAllDominoes());
        view.menuInterface(game.marketSize());

        int menu = inputValidator.input("Choose your action: ", 1, 4);
        switch (menu) {
            case 1:
                addToStartBoard(player);
                break;
            case 2:
                addToEndBoard(player);
                break;
            case 3:
                if (game.marketSize() > 0) {
                    player.addDomino(takeRandomDominoFromMarket());
                } else {
                    System.out.println("The market is empty, action isn't possible");
                }
                menuFunctionality(player);
                break;
            case 4:
                game.removePlayer(player);
                break;
        }
    }

    private boolean isMovePossible(Player player) {
        int boardLeftValue = game.getFirstDominoAtBoard().getLeftValue();
        int boardRightValue = game.getLastDominoAtBoard().getRightValue();

        for (Domino domino : player.getAllDominoes()) {
            if (domino.getLeftValue() == boardLeftValue | domino.getLeftValue() == boardRightValue) {
                return true;
            }
        }

        for (Domino domino : player.getAllDominoes()) {
            if (domino.getRightValue() == boardLeftValue | domino.getRightValue() == boardRightValue) {
                return true;
            }
        }

        return false;
    }

    private void addToStartBoard(Player player) {
        InputValidator validator = new InputValidator();
        int index = validator.input("Input number of element ",
                1, player.dominoesSize());
        Domino domino = player.getDomino(--index);

        if (game.getFirstDominoAtBoard().getLeftValue() == domino.getRightValue()) {
            game.addFirstToBoard(domino);
        } else if (game.getFirstDominoAtBoard().getLeftValue() == domino.getLeftValue()) {
            domino.swapSides();
            game.addFirstToBoard(domino);
        } else {
            System.out.println("Unfortunately, this domino does not fit here, try again or surrender");
            addToStartBoard(player);
        }

        player.removeDomino(domino);
    }

    private void addToEndBoard(Player player) {
        InputValidator validator = new InputValidator();
        int index = validator.input("Input number of element: ",
                1, player.dominoesSize());
        Domino domino = player.getDomino(--index);

        if (game.getLastDominoAtBoard().getRightValue() == domino.getLeftValue()) {
            game.addLastToBoard(domino);
        } else if (game.getLastDominoAtBoard().getRightValue() == domino.getRightValue()) {
            domino.swapSides();
            game.addLastToBoard(domino);
        } else {
            System.out.println("Unfortunately, this domino does not fit here, try again or surrender");
            addToEndBoard(player);
        }

        player.removeDomino(domino);
    }

    private Player findPlayerWithMaxDominoAndThrowMaxDominoToBoard() {
        Player playerWithMaxSumBothSides = game.getPlayer(0);
        Domino dominoWithMaxSumBothSides = playerWithMaxSumBothSides.getDomino(0);

        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < game.playersCount(); j++) {
                Player player = game.getPlayer(j);

                for (int k = 0; k < player.dominoesSize(); k++) {
                    Domino domino = player.getDomino(k);

                    if (domino.isMirror(i)) {
                        game.addFirstToBoard(domino);
                        player.removeDomino(domino);
                        return player;
                    } else {
                        if (domino.getSumBothSides() > dominoWithMaxSumBothSides.getSumBothSides()) {
                            dominoWithMaxSumBothSides = domino;
                            playerWithMaxSumBothSides = player;
                        }
                    }

                }
            }
        }

        game.addFirstToBoard(dominoWithMaxSumBothSides);
        playerWithMaxSumBothSides.removeDomino(dominoWithMaxSumBothSides);
        return playerWithMaxSumBothSides;
    }
}