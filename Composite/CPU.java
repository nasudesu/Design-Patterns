package Composite;

public class CPU extends KoneenOsa{
    public CPU(String nimi, double hinta) {
        super(nimi, hinta);
    }
    @Override
    public double laskeHinta() {
        return this.Hinta;
    }
}
