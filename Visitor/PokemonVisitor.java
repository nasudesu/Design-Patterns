package Visitor;

public class PokemonVisitor implements Visitor{
    @Override
    public void visit(Charmander charmander) {
        charmander.evolve();
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        charmeleon.evolve();
    }

    @Override
    public void visit(Charizard charizard) {
        charizard.evolve();
    }


}
