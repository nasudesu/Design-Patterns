package Adapter;

public class Adapter extends Restaurant implements IClient{

    @Override
    public void order(String drink, String mainCourse, String dessert) {
        setDrink(drink);
        setMainCourse(mainCourse);
        setDessert(dessert);
    }

    @Override
    public void showOrder() {
        showMyOrder();
    }
}
