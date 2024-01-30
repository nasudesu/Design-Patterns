package Composite;

public class Kotelo extends KoneenOsa {
    public Kotelo(String nimi, double hinta) {
        super(nimi, hinta);
    }

    @Override
    public double laskeHinta() {
        return this.Hinta;
    }
}
