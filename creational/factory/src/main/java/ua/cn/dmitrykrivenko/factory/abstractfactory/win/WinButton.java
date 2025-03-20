package ua.cn.dmitrykrivenko.factory.abstractfactory.win;

import ua.cn.dmitrykrivenko.factory.abstractfactory.Button;

/**
 * Concrete product.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class WinButton implements Button
{

	public void paint() {
		System.out.println("WinButton paint");
	}

}
