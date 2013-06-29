package ua.cn.dmitrykrivenko.command.stereo;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Stereo {

    private boolean onOff;

    public void on() {
        onOff = true;
        System.out.println("Stereo is on");
    }

    public void off() {
        onOff = false;
        System.out.println("Stereo is off");
    }

    public boolean getStereoState() {
        return onOff;
    }
}
