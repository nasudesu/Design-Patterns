package Template_Method;

public abstract class Game {

    protected int playersCount;

    abstract void initializeGame();

    abstract void makePlay();

    abstract boolean endOfGame();

    abstract void printWinner();

    /* A template method : */
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        do {
            makePlay();
        } while (!endOfGame());
        printWinner();
    }

}
