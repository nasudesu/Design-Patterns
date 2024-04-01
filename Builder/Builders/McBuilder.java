package Builder.Builders;

import Builder.Products.McBursa;

public class McBuilder implements IBuilder {

    McBursa mcBursa;
    @Override
    public void reset() {
        mcBursa = new McBursa();
    }

    public McBursa getBurger(){
        return this.mcBursa;
    }

    @Override
    public void buildStepA() {
        mcBursa.setBread("Mäkki leipä, ");
    }

    @Override
    public void buildStepB() {
        mcBursa.setSalad("Mäkki salaatti, ");
    }

    @Override
    public void buildStepC() {
        mcBursa.setBeef("Mäkki pihvi");
    }
}
