package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Concrete product.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class WinButton implements Button{

	public void paint() {
		System.out.println("WinButton paint");
	}

}
