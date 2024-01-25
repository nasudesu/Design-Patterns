package AbstractFactory.ConcreteFactory;

import AbstractFactory.Vaatteet.*;

public class VaateTehdas implements Vaatteet {

    @Override
    public Farkut makeFarkut() {
        return new Farkut();
    }

    @Override
    public Kengat makeKengat() {
        return new Kengat();
    }

    @Override
    public Paita makePaita() {
        return new Paita();
    }

    @Override
    public Lippis makeLippis() {
        return new Lippis();
    }
}
