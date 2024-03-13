package Memento;

import java.util.*;

public class Guesser extends Thread {

    private Riddler riddler;

    private Memento memento;

    private final int id;

    private static int guesserCount = 0;

    public Guesser(Riddler riddler) {
        this.riddler = riddler;
        memento = riddler.joinGame();
        this.id = ++guesserCount;
    }


    public void run() {
        try {
            while (true){
                int guess = (int) (Math.random() * 10);
                System.out.println("Guesser " + id + " guessed " + guess);
                if (riddler.checkNumber(memento, guess)) {
                    System.out.println("Guesser " + id + " wins!");
                    break;
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
