package ua.cn.dmitrykrivenko.facade;

/**
 * Represents Facade.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Computer {

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public Computer() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(10, hd.read(1, 1));
        processor.jump(1);
        processor.execute();
    }
}
