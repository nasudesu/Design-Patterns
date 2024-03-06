package ChainOfResponsibility;

public class ManagingDirector extends Handler {

    public ManagingDirector(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public double handle(double salary, double increase) {
        double isAbleToHandle = salary * 0.2;
        if (increase < isAbleToHandle) {
            System.out.println("Managing Director approved the salary increase by. " + increase);
            return salary + (salary * 0.1);
        } else System.out.println("Managing Director will not approve request max acceptable is 20% increase. ");
        return salary;
    }
}
