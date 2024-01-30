package Composite;

public class Emolevy extends KoneenOsa{

    public Emolevy(String nimi, double hinta) {
        super(nimi, hinta);
    }

    @Override
    public double laskeHinta() {
        return this.Hinta;
    }
}
