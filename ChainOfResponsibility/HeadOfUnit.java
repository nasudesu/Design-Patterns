package ChainOfResponsibility;

public class HeadOfUnit extends Handler {
    public HeadOfUnit(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public double handle(double salary, double increase) {
        double isAbleToHandle = salary * 0.05;
        if (increase < isAbleToHandle) {
            System.out.println("Head of unit approved the salary increase by " + increase);
            return salary + increase;
        } else {
            System.out.println("Head of unit will not approve request max acceptable is 5% increase.");
            return handleNext(salary, increase);
        }
    }
}
