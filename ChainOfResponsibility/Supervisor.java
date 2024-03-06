package ChainOfResponsibility;

public class Supervisor extends Handler {

    public Supervisor(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public double handle(double salary, double increase) {
        double isAbleToHandle = salary * 0.02;
        if (increase < isAbleToHandle) {
            System.out.println("Supervisor approved the salary increase by " + increase);
            return salary + increase;
        } else {
            System.out.println("Supervisor will not approve request max acceptable is 2% increase.");
            return handleNext(salary, increase);
        }
    }
}
