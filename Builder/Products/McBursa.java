package Builder.Products;

public class McBursa {

    private final StringBuilder burgerDetails = new StringBuilder();

    public void setBeef(String beef) {
        burgerDetails.append(beef);
    }

    public void setSalad(String salad) {
        burgerDetails.append(salad);
    }

    public void setBread(String bread) {
        burgerDetails.append(bread);
    }

    @Override
    public String toString() {
        return "McBursa " +
                " bursa = " + burgerDetails
                ;
    }
}
