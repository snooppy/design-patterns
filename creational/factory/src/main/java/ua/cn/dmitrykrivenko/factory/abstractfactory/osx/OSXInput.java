package ua.cn.dmitrykrivenko.factory.abstractfactory.osx;

import ua.cn.dmitrykrivenko.factory.abstractfactory.Input;

/**
 * Concrete product.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class OSXInput implements Input
{

	public String getText() {
		return "OSXInput text";
	}

}
