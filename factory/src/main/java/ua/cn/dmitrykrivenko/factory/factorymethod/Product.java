package ua.cn.dmitrykrivenko.factory.factorymethod;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public abstract class Product {

    private String name;

    public void  setName(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }
}
