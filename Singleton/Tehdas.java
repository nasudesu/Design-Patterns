package Singleton;

import Singleton.Tuotteet.Farkut;
import Singleton.Tuotteet.Kengat;
import Singleton.Tuotteet.Lippis;
import Singleton.Tuotteet.Paita;

public abstract class Tehdas {

    public abstract Farkut makeFarkut();
    public abstract Kengat makeKengat();
    public abstract Lippis makeLippis();
    public abstract Paita makePaita();
}
