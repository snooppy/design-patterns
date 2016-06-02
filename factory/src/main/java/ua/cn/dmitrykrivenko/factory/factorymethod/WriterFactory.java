package ua.cn.dmitrykrivenko.factory.factorymethod;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class WriterFactory {

	/**
	 * Factory method.
	 *
	 * @param type
	 * @return instance of Writer
	 */
	public Writer getWriter(String type) {
		switch (type) {
			case "XML":
				return new XmlWriter();
			case "FILE":
				return new FileWriter();
			default:
				throw new IllegalArgumentException(type + "isn't supported");
		}
	}

}
