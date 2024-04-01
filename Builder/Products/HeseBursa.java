package Builder.Products;

import Builder.ProductDetails.Beef;
import Builder.ProductDetails.Bread;
import Builder.ProductDetails.Salad;

import java.util.ArrayList;
import java.util.List;

public class HeseBursa {

    private final List<Object> burgerDetails = new ArrayList<>();

    public void setBeef(Beef beef) {
        burgerDetails.add(beef);
    }

    public void setBread(Bread bread) {
        burgerDetails.add(bread);
    }

    public void setSalad(Salad salad) {
        burgerDetails.add(salad);
    }

    @Override
    public String toString() {
        return "HeseBursa " +
                " burgerDetails = " + burgerDetails ;
    }
}
