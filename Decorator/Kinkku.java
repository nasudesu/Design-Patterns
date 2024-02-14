package Decorator;

public class Kinkku extends PizzaTayte{

    public Kinkku(IPizzaTayte pizzaTayte) {
        super(pizzaTayte);
    }

    @Override
    public void lisaaTayte() {
        super.lisaaTayte();
        System.out.println("Kinkku");
    }

    @Override
    public double haeHinta() {
        return super.haeHinta() + 2.5;
    }
}
