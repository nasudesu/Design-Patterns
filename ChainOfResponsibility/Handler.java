package ChainOfResponsibility;

public abstract class Handler {
    private Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract double handle(double salary,double increase);

    public double handleNext(double salary, double increase) {
        if (nextHandler == null) {
            System.out.println("No one can handle the salary increase.");
            return salary;
        }
        return nextHandler.handle(salary, increase);
    }

}
