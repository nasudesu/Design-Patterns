package Adapter;

public class Client {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.order("Fanta", "Kebab", "Baklava");
        restaurant.showOrder();


        Adapter client = new Adapter();
        client.order("Coke", "Chicken", "Cake");
        client.showOrder();
    }
}
