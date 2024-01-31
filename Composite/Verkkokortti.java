package Composite;

public class Verkkokortti extends KoneenOsa{

    public Verkkokortti(String nimi, double hinta) {
        super(nimi, hinta);
    }

    @Override
    public double laskeHinta() {
        return this.Hinta;
    }

    @Override
    public void lisaaKomponentti(Komponentti komponentti) {

    }
}
