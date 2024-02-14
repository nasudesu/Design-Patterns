package State;

public class Charmeleon extends PokemonState{

    public Charmeleon(Pokemon pokemon) {
        super(pokemon);
    }
    @Override
    public void attack() {
        System.out.println("Charmeleon used Ember!");
    }

    @Override
    public void defend() {
        System.out.println("Charmeleon used Smokescreen!");
    }

    @Override
    public void rest() {
        System.out.println("Charmeleon is resting!");
    }

    @Override
    public void evolve() {
        pokemon.setState(new Charizard(pokemon));
        System.out.println("Charmeleon has evolved into Charizard!");
    }

    @Override
    public void printStatus() {
        System.out.println("Charmeleon is ready to fight!");
    }
}
