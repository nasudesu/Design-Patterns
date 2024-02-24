package Template_Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberGuess extends Game {

    private final List<Player> players = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    private int numberToGuess;


    @Override
    void initializeGame() {
        for (int i = 0; i < playersCount; i++) {
            players.add(new Player());
            System.out.println("Player " + players.get(i).getPlayerNumber() + " joined the game");
        }
    }

    @Override
    void makePlay() {
        numberToGuess = (int) (Math.random() * 10);
        System.out.println(numberToGuess);
        System.out.println("-----------------------------------");
        for (Player player : players) {
            System.out.println("Player " + player.getPlayerNumber() + " guessed the number! ");
            int guess = scanner.nextInt();
            if (guess == numberToGuess) {
                player.setScore(player.getScore() + 1);
                System.out.println("Correct! Player " + player.getPlayerNumber() + " has " + player.getScore() + " points!");
            } else {
                System.out.println("Wrong! Player " + player.getPlayerNumber() + " has " + player.getScore() + " points!");
            }
        }
    }

    @Override
    boolean endOfGame() {
        for (Player player : players) {
            if (player.getScore() == 5) {
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        for (Player player : players) {
            if (player.getScore() == numberToGuess) {
                System.out.println("Player " + player.getPlayerNumber() + " wins!");
            }
        }
    }
}
