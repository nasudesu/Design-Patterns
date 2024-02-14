package State;

public class Charmander extends PokemonState{

    public Charmander(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void attack() {
        System.out.println("Charmander used Scratch!");
    }

    @Override
    public void defend() {
        System.out.println("Charmander used Growl!");
    }

    @Override
    public void rest() {
        System.out.println("Charmander is resting!");
    }

    @Override
    public void evolve() {
        pokemon.setState(new Charmeleon(pokemon));
        System.out.println("Charmander has evolved into Charmeleon!");
    }

    @Override
    public void printStatus() {
        System.out.println("Charmander is ready to fight!");
    }
}
