package Memento;

public class Memento {
    private final int number;

    public Memento(int numberToSave) {
        this.number = numberToSave;
    }

    public int getNumber() {
        return number;
    }
}
