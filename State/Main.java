package State;

public class Main{
    public static void main(String[] args) throws InterruptedException {

        Pokemon pokemon = new Pokemon();
        while (true) {
            pokemon.printStatus();
            pokemon.attack();
            pokemon.defend();
            pokemon.rest();
            pokemon.evolve();
        }
    }
}
