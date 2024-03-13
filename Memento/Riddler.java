package Memento;

public class Riddler {


    public Memento joinGame() {
        int number = (int) (Math.random() * 10);
        System.out.println(number);
        return new Memento(number);
    }

    public boolean checkNumber(Memento memento, int guess) {
        return memento.getNumber() == guess;
    }

}
