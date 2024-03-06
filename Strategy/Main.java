package Strategy;

public class Main {
    public static void main(String[] args) {
        String[] list = {"1. Dog", "2. Cat", "3. Bird", "4. Fish", "5. Elephant", "6. Lion", "7. Tiger", "8. Bear", "9. Wolf", "10. Fox"};
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
