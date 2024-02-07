package Singleton.KonkreettinenTehdas;

import Singleton.*;
import Singleton.AddunTuotteet.AdduFarkut;
import Singleton.AddunTuotteet.AdduKengat;
import Singleton.AddunTuotteet.AdduLippis;
import Singleton.AddunTuotteet.AdduPaita;
import Singleton.Tuotteet.Farkut;
import Singleton.Tuotteet.Kengat;
import Singleton.Tuotteet.Lippis;
import Singleton.Tuotteet.Paita;

public class AdduTehdas extends Tehdas {

    private static AdduTehdas instance = null;

    public static AdduTehdas getInstance() {
        if (instance == null) {
            instance = new AdduTehdas();
        } else {
            System.out.println("AdduTehdas on jo luotu");
        }
        return instance;
    }

    private AdduTehdas() {
        System.out.println("AdduTehdas luotu");
    }


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
