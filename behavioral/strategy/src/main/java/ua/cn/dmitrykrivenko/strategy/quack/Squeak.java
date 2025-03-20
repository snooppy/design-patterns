package ua.cn.dmitrykrivenko.strategy.quack;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class Squeak implements QuackBehavior
{

    @Override
    public String quack() {
        String quack = "Squeak";
        System.out.println(quack);
        return quack;
    }
}
