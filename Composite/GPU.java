package Composite;

public class GPU extends KoneenOsa{

    public GPU(String nimi, double hinta) {
        super(nimi, hinta);
    }

    @Override
    public double laskeHinta() {
        return this.Hinta;
    }
}
