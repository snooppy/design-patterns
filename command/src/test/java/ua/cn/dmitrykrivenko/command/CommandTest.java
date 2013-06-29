package ua.cn.dmitrykrivenko.command;

import org.junit.Test;
import org.junit.Assert;
import ua.cn.dmitrykrivenko.command.light.Light;
import ua.cn.dmitrykrivenko.command.light.LightOffCommand;
import ua.cn.dmitrykrivenko.command.light.LightOnCommand;
import ua.cn.dmitrykrivenko.command.stereo.Stereo;
import ua.cn.dmitrykrivenko.command.stereo.StereoOffCommand;
import ua.cn.dmitrykrivenko.command.stereo.StereoOnCommand;

/**
 * Unit test for simple Command design pattern.
 */
public class CommandTest {

    @Test
    public void testCommand() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);

        remoteControl.onButtonWasPushed(0);
        Assert.assertTrue(livingRoomLight.getLightState());
        remoteControl.offButtonWasPushed(0);
        Assert.assertFalse(livingRoomLight.getLightState());

        remoteControl.onButtonWasPushed(1);
        Assert.assertTrue(kitchenLight.getLightState());
        remoteControl.offButtonWasPushed(1);
        Assert.assertFalse(kitchenLight.getLightState());

        remoteControl.onButtonWasPushed(2);
        Assert.assertTrue(stereo.getStereoState());
        remoteControl.offButtonWasPushed(2);
        Assert.assertFalse(stereo.getStereoState());

        remoteControl.onButtonWasPushed(2);
        Assert.assertTrue(stereo.getStereoState());
        remoteControl.undoButtonWasPushed();
        Assert.assertFalse(stereo.getStereoState());
    }
}
