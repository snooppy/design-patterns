package ua.cn.dmitrykrivenko.facade;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Memory load: " + position + ", " + data.length);
    }
}
