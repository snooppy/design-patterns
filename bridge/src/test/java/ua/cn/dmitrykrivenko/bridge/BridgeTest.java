package ua.cn.dmitrykrivenko.bridge;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple Bridge.
 */
public class BridgeTest {

    @Test
    public void testBridge() {
        TV tvSony = new SonyTV();

        LogitechRemoteControl lrc = new LogitechRemoteControl(tvSony, 30);
        lrc.setStation(15);
        lrc.turnOn();

        Assert.assertTrue(lrc.nextChannel() == 16);
        Assert.assertTrue(lrc.previousChannel() == 15);

        lrc.turnOff();

        TV tvSamsung = new SamsungTV();

        lrc = new LogitechRemoteControl(tvSamsung, 20);
        lrc.setStation(19);
        lrc.turnOn();

        Assert.assertTrue(lrc.nextChannel() == 0);
        Assert.assertTrue(lrc.previousChannel() == 19);

        lrc.turnOff();
    }
}
