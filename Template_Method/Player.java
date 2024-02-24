package Template_Method;

public class Player {
    private final int playerNumber;
    private int score;

    static int playerCount = 0;

    public Player() {
        this.playerNumber = ++playerCount;
        this.score = 0;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
