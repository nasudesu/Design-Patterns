package Decorator;

public class Sieni extends PizzaTayte{

    public Sieni(IPizzaTayte pizzaTayte) {
        super(pizzaTayte);
    }

    @Override
    public void lisaaTayte() {
        super.lisaaTayte();
        System.out.println("Sieni");
    }

    @Override
    public double haeHinta() {
        return super.haeHinta() + 1.7;
    }
}
