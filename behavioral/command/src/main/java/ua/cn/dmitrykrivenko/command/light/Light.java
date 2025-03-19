package ua.cn.dmitrykrivenko.command.light;

/**
 * Receiver.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Light {

	private boolean onOff;

	public void on() {
		onOff = true;
		System.out.println("Light is on");
	}

	public void off() {
		onOff = false;
		System.out.println("Light is off");
	}

	public boolean getLightState() {
		return onOff;
	}
}
