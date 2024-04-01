package Builder.Builders;

import Builder.ProductDetails.Beef;
import Builder.ProductDetails.Bread;
import Builder.ProductDetails.Salad;
import Builder.Products.HeseBursa;

public class HeseBuilder implements IBuilder {

    HeseBursa heseBursa;

    @Override
    public void reset() {
        heseBursa = new HeseBursa();
    }

    public HeseBursa getBurger(){
        return this.heseBursa;
    }

    @Override
    public void buildStepA() {
        heseBursa.setSalad(new Salad("Hese salaatti"));
    }

    @Override
    public void buildStepB() {
        heseBursa.setBeef(new Beef("Hese pihvi"));
    }

    @Override
    public void buildStepC() {
        heseBursa.setBread(new Bread("Hese leipä"));
    }
}
