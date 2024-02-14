package Decorator;

public class Tomaatti extends PizzaTayte{
    public Tomaatti(IPizzaTayte pizzaTayte) {
        super(pizzaTayte);
    }

    @Override
    public void lisaaTayte() {
        super.lisaaTayte();
        System.out.println("Tomaatti");
    }

    @Override
    public double haeHinta() {
        return super.haeHinta() + 1.5;
    }
}
