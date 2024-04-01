package Builder;

import Builder.Builders.HeseBuilder;
import Builder.Builders.IBuilder;
import Builder.Builders.McBuilder;
import Builder.Products.HeseBursa;
import Builder.Products.McBursa;

public class Main {
    public static void main(String[] args) {

        IBuilder mcBuilder = new McBuilder();
        HeseBuilder heseBuilder = new HeseBuilder();
        Director director = new Director();

        director.setiBuilder(heseBuilder);
        director.makePizza();

        HeseBursa bursa = heseBuilder.getBurger();
        System.out.println(bursa);

        director.setiBuilder(mcBuilder);
        director.makePizza();

        McBursa mcBursa = ((McBuilder) mcBuilder).getBurger();
        System.out.println(mcBursa);
    }
}
