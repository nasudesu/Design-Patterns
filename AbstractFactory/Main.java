package AbstractFactory;

public class Main {

    public static void main(String[] args) {

        Tehdas tehdas = new AdduTehdas();
        Farkut farkut = tehdas.makeFarkut();
        Paita paita = tehdas.makePaita();
        Lippis lippis = tehdas.makeLippis();
        Kengat kengat = tehdas.makeKengat();

        System.out.println("Jasperilla on:");
        farkut.pueFarkut();
        paita.puePaita();
        lippis.pueLippis();
        kengat.pueKengat();

    }
}
