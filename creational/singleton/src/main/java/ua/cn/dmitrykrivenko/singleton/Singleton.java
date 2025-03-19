package ua.cn.dmitrykrivenko.singleton;

/**
 * Example of Singleton design pattern.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
