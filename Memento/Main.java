package Memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Guesser> guesserList = new ArrayList<>();
        Riddler riddler = new Riddler();

        for (int i = 0; i < 3; i++) {
            Guesser guesser = new Guesser(riddler);
            guesserList.add(guesser);
        }

        for (Guesser guesser : guesserList) {
            guesser.start();
        }


    }
}
