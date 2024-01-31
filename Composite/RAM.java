package Composite;

public class RAM extends KoneenOsa{

    public RAM(String nimi, double hinta){
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
