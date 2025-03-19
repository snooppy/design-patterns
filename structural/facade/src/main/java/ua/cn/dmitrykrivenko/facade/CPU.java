package ua.cn.dmitrykrivenko.facade;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CPU {

    public void freeze() {
        System.out.println("Freeze");
    }

    public void jump(long position) {
        System.out.println("jump to position " + position);
    }

    public void execute() {
        System.out.println("Execute");
    }
}
