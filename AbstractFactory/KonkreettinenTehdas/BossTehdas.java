package AbstractFactory.KonkreettinenTehdas;

import AbstractFactory.*;

public class BossTehdas extends Tehdas {

    @Override
    public Farkut makeFarkut() {
        return new BossFarkut();
    }

    @Override
    public Kengat makeKengat() {
        return new BossKengat();
    }

    @Override
    public Lippis makeLippis() {
        return new BossLippis();
    }

    @Override

    public Paita makePaita() {
        return new BossPaita();
    }
}
