package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ConcreteClient1 extends Client {

    private AbstractFactory abstractFactory;

    public ConcreteClient1(AbstractFactory factory) {
        abstractFactory = factory;
    }

    @Override
    public void createProducts() {
        setAbstractProductA(abstractFactory.createProductA());
        setAbstractProductB(abstractFactory.createProductB());
    }
}
