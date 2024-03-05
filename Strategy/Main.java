package Strategy;

public class Main {
    public static void main(String[] args) {
        String[] list = {"a", "b", "c", "d", "e"};
        ListConverter one = new EveryOne();
        ListConverter two = new EverySecond();
        ListConverter three = new EveryThird();

        ListConver listConver = new ListConver(one, list);
        listConver.printList();
        listConver.setStrategy(two);
        listConver.printList();
        listConver.setStrategy(three);
        listConver.printList();


    }
}
