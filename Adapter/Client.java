package Adapter;

public class Client {
    public static void main(String[] args) {

        IClient client = new Adapter();
        client.order("Coke", "Chicken", "Cake");
        client.showOrder();
    }
}
