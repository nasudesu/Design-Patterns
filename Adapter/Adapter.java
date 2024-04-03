package Adapter;

public class Adapter implements IClient{

    private final Restaurant restaurant;

    public Adapter() {
        this.restaurant = new Restaurant();
    }

    @Override
    public void order(String drink, String mainCourse, String dessert) {
        restaurant.setDrink(drink);
        restaurant.setMainCourse(mainCourse);
        restaurant.setDessert(dessert);
    }

    @Override
    public void showOrder() {
        restaurant.showOrder();
    }
}
