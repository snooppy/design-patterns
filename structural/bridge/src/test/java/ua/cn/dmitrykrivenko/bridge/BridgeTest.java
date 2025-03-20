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

        LogitechRemoteControl remoteControl = new LogitechRemoteControl(tvSony, 30);
        remoteControl.setStation(15);
        remoteControl.turnOn();

       Assert.assertEquals(16, remoteControl.nextChannel());
       Assert.assertEquals(15, remoteControl.previousChannel());

        remoteControl.turnOff();

        TV tvSamsung = new SamsungTV();

        remoteControl = new LogitechRemoteControl(tvSamsung, 20);
        remoteControl.setStation(19);
        remoteControl.turnOn();

       Assert.assertEquals(0, remoteControl.nextChannel());
       Assert.assertEquals(19, remoteControl.previousChannel());

        remoteControl.turnOff();
    }
}
