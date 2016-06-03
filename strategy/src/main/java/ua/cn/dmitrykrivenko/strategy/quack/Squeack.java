package ua.cn.dmitrykrivenko.strategy.quack;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Squeack implements QuackBehavoir {

    @Override
    public String quack() {
        String quack = "Squeack";
        System.out.println(quack);
        return quack;
    }
}
