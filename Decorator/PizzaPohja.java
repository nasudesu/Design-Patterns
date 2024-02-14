package Decorator;

public class PizzaPohja implements IPizzaTayte{

    private String tyyppi;

    private double hinta;

    public PizzaPohja(String tyyppi, double hinta) {
        this.tyyppi = tyyppi;
        this.hinta = hinta;
    }
    @Override
    public void lisaaTayte() {
        System.out.println("Pizzaan lisätty tyyppi:\n" + tyyppi);
    }

    @Override
    public double haeHinta() {
        return hinta;
    }
}
