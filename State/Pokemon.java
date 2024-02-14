package State;

public class Pokemon extends Thread{
    private PokemonState state;

    public Pokemon() {
        state = new Charmander(this);
    }

    public void setState(PokemonState state) {
        this.state = state;
    }

    public void attack() {
        state.attack();
    }

    public void defend() {
        state.defend();
    }

    public void rest() {
        state.rest();
    }

    public void evolve() {
        state.evolve();
    }

    public void printStatus() {
        state.printStatus();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                attack();
                Thread.sleep(1000);
                defend();
                Thread.sleep(1000);
                rest();
                Thread.sleep(1000);
                evolve();
                Thread.sleep(1000);
                printStatus();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
