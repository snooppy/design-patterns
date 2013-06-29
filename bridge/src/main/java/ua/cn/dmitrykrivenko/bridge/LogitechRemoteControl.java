package ua.cn.dmitrykrivenko.bridge;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class LogitechRemoteControl extends RemoteControl {

    private int currentStation;
    private int channelCount;

    public LogitechRemoteControl(TV tv, int channelCount) {
        super(tv);
        this.channelCount = channelCount;
    }

    public void setStation(int station) {
        this.currentStation = station;
    }

    public int nextChannel() {
        if (currentStation == channelCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
        setChannel(currentStation);
        return currentStation;
    }

    public int previousChannel() {
        if (currentStation == 0) {
            currentStation = channelCount - 1;
        } else {
            currentStation--;
        }
        setChannel(currentStation);
        return currentStation;
    }
}
