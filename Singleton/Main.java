package Singleton;

import Singleton.KonkreettinenTehdas.AdduTehdas;
import Singleton.Tuotteet.Farkut;
import Singleton.Tuotteet.Kengat;
import Singleton.Tuotteet.Lippis;
import Singleton.Tuotteet.Paita;

public class Main {

    public static void main(String[] args) {

        Tehdas tehdas = AdduTehdas.getInstance();
        Farkut farkut = tehdas.makeFarkut();
        Paita paita = tehdas.makePaita();
        Lippis lippis = tehdas.makeLippis();
        Kengat kengat = tehdas.makeKengat();

        System.out.println("Jasperilla on:");
        farkut.pueFarkut();
        paita.puePaita();
        lippis.pueLippis();
        kengat.pueKengat();

        Tehdas tehdas2 = AdduTehdas.getInstance();


    }
}
