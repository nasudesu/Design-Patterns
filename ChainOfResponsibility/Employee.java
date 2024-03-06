package ChainOfResponsibility;

public class Employee {

    private double salary;

    private Handler handler;

    public Employee(double salary, Handler handler) {
        this.salary = salary;
        this.handler = handler;
    }

    public void increaseSalary(double increase){
        salary = handler.handle(this.salary, increase);
        System.out.println("New salary: " + salary);
    };
}
