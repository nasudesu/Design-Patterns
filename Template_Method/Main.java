package Template_Method;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game game = new NumberGuess();
        game.playOneGame(2);
    }
}
