package ua.cn.dmitrykrivenko.factory.factorymethod;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class XmlWriterCreator implements WriterCreator {

	@Override
	public Writer createWriter() {
		return new XmlWriter();
	}

}
