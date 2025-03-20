package ua.cn.dmitrykrivenko.factory.abstractfactory.osx;

import ua.cn.dmitrykrivenko.factory.abstractfactory.Button;

/**
 * Concrete product.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class OSXButton implements Button
{

	public void paint() {
		System.out.println("OSXButton print");
	}

}
