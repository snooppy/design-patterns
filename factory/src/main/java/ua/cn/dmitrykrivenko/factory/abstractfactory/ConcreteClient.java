package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ConcreteClient extends Client {

    private final AbstractFactory abstractFactory;

    public ConcreteClient(AbstractFactory factory) {
        abstractFactory = factory;
    }

    @Override
    public void createProducts() {
        setAbstractProductA(abstractFactory.createProductA());
        setAbstractProductB(abstractFactory.createProductB());
    }
}
