package ua.cn.dmitrykrivenko.bridge;

/**
 * Concrete implementor.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class SonyTV implements TV {

	@Override
	public void on() {
		System.out.println("Sony is turned on");
	}

	@Override
	public void off() {
		System.out.println("Sony is turned off");
	}

	@Override
	public void switchChannel(int channel) {
		System.out.println("Sony: channel - " + channel);
	}
}
