package Facade;

public class HardDrive {
    public char[] read(long lba, int size) {
        // Simulated read operation from hard drive
        System.out.println("Hard Drive: Reading from LBA " + lba + " with size " + size + "...");
        return new char[size];
    }
}
