package Decorator;

public class Juusto extends PizzaTayte{
    public Juusto(IPizzaTayte pizzaTayte) {
        super(pizzaTayte);
    }

    @Override
    public void lisaaTayte() {
        super.lisaaTayte();
        System.out.println("Juusto");
    }

    @Override
    public double haeHinta() {
        return super.haeHinta() + 2.0;
    }
}
