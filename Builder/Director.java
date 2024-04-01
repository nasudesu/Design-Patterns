package Builder;

import Builder.Builders.IBuilder;

public class Director {
    IBuilder iBuilder;

    public void setiBuilder(IBuilder iBuilder){
        this.iBuilder = iBuilder;
    }

    public void makePizza(){
        iBuilder.reset();
        iBuilder.buildStepA();
        iBuilder.buildStepB();
        iBuilder.buildStepC();
    }


}
