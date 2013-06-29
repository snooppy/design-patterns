package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface AbstractFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
