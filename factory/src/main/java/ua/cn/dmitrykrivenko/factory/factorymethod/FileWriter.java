package ua.cn.dmitrykrivenko.factory.factorymethod;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FileWriter implements Writer {

	@Override
	public void write(String context) {
		System.out.println("XmlWriter " + context);
	}
}
