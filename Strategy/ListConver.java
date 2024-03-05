package Strategy;

public class ListConver {

    private ListConverter strategy;
    private String[] list;

    public ListConver(ListConverter strategy, String[] list) {
        this.strategy = strategy;
        this.list = list;
    }

    public void printList() {
        System.out.println(strategy.listToString(list));
    }

    public void setStrategy(ListConverter strategy) {
        this.strategy = strategy;
    }

}
