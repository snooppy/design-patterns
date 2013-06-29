package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public abstract class Client {

    private AbstractProductA productA;
    private AbstractProductB productB;

    public abstract void createProducts();

    public AbstractProductA getAbstractProductA() {
        return productA;
    }

    public AbstractProductB getAbstractProductB() {
        return productB;
    }

    public void setAbstractProductA(AbstractProductA a) {
        productA = a;
    }

    public void setAbstractProductB(AbstractProductB b) {
        productB = b;
    }
}
