package Visitor;

public abstract class PokemonState {

    Pokemon pokemon;

    public PokemonState(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public abstract void attack();

    public abstract void defend();

    public abstract void rest();

    public abstract void evolve();

    public abstract void printStatus();

    public abstract void accept(Visitor visitor);
}
