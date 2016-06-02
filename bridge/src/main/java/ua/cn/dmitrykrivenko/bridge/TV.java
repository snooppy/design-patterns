package ua.cn.dmitrykrivenko.bridge;

/**
 * Implementor.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface TV {

	public void on();

	public void off();

	public void switchChannel(int channel);
}
