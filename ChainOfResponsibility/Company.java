package ChainOfResponsibility;

public class Company {
    public static void main(String[] args) {

        //Handler managingDirector = new ManagingDirector(null);
        //Handler headOfUnit = new HeadOfUnit(managingDirector);

        Handler supervisor = new Supervisor(new HeadOfUnit(new ManagingDirector(null)));


        Employee employee = new Employee(5000, supervisor);
        employee.increaseSalary(100);
    }
}
