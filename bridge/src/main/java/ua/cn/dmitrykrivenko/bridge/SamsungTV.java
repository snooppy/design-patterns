package ua.cn.dmitrykrivenko.bridge;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class SamsungTV implements TV {

    public void on() {
        System.out.println("Samsung is turned on");
    }

    public void off() {
        System.out.println("Samsung is turned off");
    }

    public void switchChannel(int channel) {
        System.out.println("Samsung: channel - " + channel);
    }
}
