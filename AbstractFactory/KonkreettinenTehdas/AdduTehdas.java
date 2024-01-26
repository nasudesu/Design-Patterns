package AbstractFactory.KonkreettinenTehdas;

import AbstractFactory.*;

public class AdduTehdas extends Tehdas {
    @Override
    public Farkut makeFarkut() {
        return new AdduFarkut();
    }

    @Override
    public Kengat makeKengat() {
        return new AdduKengat();
    }

    @Override
    public Lippis makeLippis() {
        return new AdduLippis();
    }

    @Override
    public Paita makePaita() {
        return new AdduPaita();
    }
}
