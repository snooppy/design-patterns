package ua.cn.dmitrykrivenko.templatemethod;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Tea extends CaffeineBeverage
{

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
