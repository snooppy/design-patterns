package ua.cn.dmitrykrivenko.factory.abstractfactory.win;

import ua.cn.dmitrykrivenko.factory.abstractfactory.Input;

/**
 * Concrete product.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class WinInput implements Input
{

	public String getText() {
		return "WinInput text";
	}

}
