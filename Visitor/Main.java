package Visitor;

public class Main{
    public static void main(String[] args) throws InterruptedException {

        Pokemon pokemon = new Pokemon();
        Visitor visitor = new PokemonVisitor();
        while (true) {
            pokemon.printStatus();
            pokemon.attack();
            pokemon.defend();
            pokemon.rest();
            pokemon.getState().accept(visitor);
        }
    }
}
