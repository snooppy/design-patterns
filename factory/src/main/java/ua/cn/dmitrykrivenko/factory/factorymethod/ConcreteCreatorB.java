package ua.cn.dmitrykrivenko.factory.factorymethod;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ConcreteCreatorB extends Creator {

    @Override
    public Product createProduct(String productType) {
        if (productType.equals("Product B")) {
            return new ConcreteProductB("Concrete Product B");
//        } else if(productType.equals("Product B1")){
//        } else if(productType.equals("Product B2")){
//        ...            
        } else {
            return null;
        }
    }
}
