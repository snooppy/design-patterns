package ua.cn.dmitrykrivenko.factory.factorymethod;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ConcreteCreatorA extends Creator {

    public Product createProduct(String productType) {
        if (productType.equals("Product A")) {
            return new ConcreteProductB("Concrete Product A");
//        } else if(productType.equals("Product A1")){
//        } else if(productType.equals("Product A2")){
//        ...            
        } else {
            return null;
        }
    }
}