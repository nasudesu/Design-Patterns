package State;

public class Charizard extends PokemonState{

    public Charizard(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void attack() {
        System.out.println("Charizard used Flamethrower!");
    }

    @Override
    public void defend() {
        System.out.println("Charizard used Dragon Tail!");
    }

    @Override
    public void rest() {
        System.out.println("Charizard is resting!");
    }

    @Override
    public void evolve() {
        System.out.println("Charizard has reached its final form!");
    }

    @Override
    public void printStatus() {
        System.out.println("Charizard is ready to fight!");
    }
}
