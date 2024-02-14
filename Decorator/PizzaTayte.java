package Decorator;

public abstract class PizzaTayte implements IPizzaTayte{

    protected IPizzaTayte pizzaTayte;

    public PizzaTayte(IPizzaTayte pizzaTayte) {
        this.pizzaTayte = pizzaTayte;
    }

    @Override
    public void lisaaTayte() {
        pizzaTayte.lisaaTayte();
    }

    @Override
    public double haeHinta() {
        return pizzaTayte.haeHinta();
    }
}
