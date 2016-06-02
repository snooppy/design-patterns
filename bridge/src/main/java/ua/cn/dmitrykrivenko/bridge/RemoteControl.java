package ua.cn.dmitrykrivenko.bridge;

/**
 * Abstraction.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public abstract class RemoteControl {

	private final TV tv;

	public RemoteControl(TV tv) {
		this.tv = tv;
	}

	public void turnOn() {
		tv.on();
	}

	public void turnOff() {
		tv.off();
	}

	public void setChannel(int channel) {
		tv.switchChannel(channel);
	}
}
