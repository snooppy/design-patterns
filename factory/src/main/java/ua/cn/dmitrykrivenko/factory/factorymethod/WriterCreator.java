package ua.cn.dmitrykrivenko.factory.factorymethod;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface WriterCreator {

	/**
	 * Factory method.
	 *
	 * @return concrete writer
	 */
	public Writer createWriter();

}
