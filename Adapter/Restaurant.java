package Adapter;

public class Restaurant {
    String drink = null;
    String mainCourse = null;
    String dessert = null;

    private int price = 0;

    public void setDrink(String drink) {
        price += 5;
        this.drink = drink;
    }

    public void setMainCourse(String mainCourse) {
        price += 10;
        this.mainCourse = mainCourse;
    }

    public void setDessert(String dessert) {
        price += 3;
        this.dessert = dessert;
    }

    public void showMyOrder() {
        System.out.println("------Order-----");
        System.out.println("Drink: " + drink);
        System.out.println("Main Course: " + mainCourse);
        System.out.println("Dessert: " + dessert);
        System.out.println("Total Price: " + price);
    }
}
