package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Concrete product.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class OSXButton implements Button {

	public void paint() {
		System.out.println("OSXButton print");
	}

}
