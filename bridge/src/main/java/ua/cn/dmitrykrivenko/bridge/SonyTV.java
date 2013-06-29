package ua.cn.dmitrykrivenko.bridge;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class SonyTV implements TV {

    public void on() {
        System.out.println("Sony is turned on");
    }

    public void off() {
        System.out.println("Sony is turned off");
    }

    public void switchChannel(int channel) {
        System.out.println("Sony: channel - " + channel);
    }
}
