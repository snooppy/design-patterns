package ua.cn.dmitrykrivenko.flyweight;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public abstract class EnglishCharacter {

    protected char symbol;
    protected int width;
    protected int height;

    public abstract char printCharacter();
}
