package Facade;

public class CPU {
    public void freeze() {
        System.out.println("CPU: Freezing...");
    }

    public void jump(long position) {
        System.out.println("CPU: Jumping to position " + position + "...");
    }

    public void execute() {
        System.out.println("CPU: Executing...");
    }
}