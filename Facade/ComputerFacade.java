package Facade;

public class ComputerFacade {
    private static final long BOOT_ADDRESS = 123456; // Just an arbitrary boot address
    private static final long BOOT_SECTOR = 987654; // Just an arbitrary boot sector
    private static final int SECTOR_SIZE = 512; // Just an arbitrary sector size

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        char[] bootData = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
        memory.load(BOOT_ADDRESS, bootData);
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
