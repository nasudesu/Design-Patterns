package Singleton.KonkreettinenTehdas;

import Singleton.*;
import Singleton.BossinTuotteet.BossFarkut;
import Singleton.BossinTuotteet.BossKengat;
import Singleton.BossinTuotteet.BossLippis;
import Singleton.BossinTuotteet.BossPaita;
import Singleton.Tuotteet.Farkut;
import Singleton.Tuotteet.Kengat;
import Singleton.Tuotteet.Lippis;
import Singleton.Tuotteet.Paita;

public class BossTehdas extends Tehdas {

    private static BossTehdas instance = null;

    public static BossTehdas getInstance() {
        if (instance == null) {
            instance = new BossTehdas();
            //System.out.println("BossTehdas luotu");
        }

        return instance;
    }

    private BossTehdas() {
        System.out.println("BossTehdas luotu");
    }

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
