package Visitor;

public class Pokemon{
    private PokemonState state;

    public Pokemon() {
        state = new Charmander(this);
    }

    public PokemonState getState() {
        return state;
    }

    public void setState(PokemonState state) {
        this.state = state;
    }

    public void attack() throws InterruptedException {
        Thread.sleep(1000);
        state.attack();
    }

    public void defend() throws InterruptedException {
        Thread.sleep(1000);
        state.defend();
    }

    public void rest() throws InterruptedException {
        Thread.sleep(1000);
        state.rest();
    }

    public void evolve() throws InterruptedException {
        Thread.sleep(1000);
        state.evolve();
    }

    public void printStatus() throws InterruptedException {
        Thread.sleep(1000);
        state.printStatus();
    }
}
