package ua.cn.dmitrykrivenko.flyweight;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class CharacterC extends EnglishCharacter {

    public CharacterC() {
        simbol = 'C';
        width = 40;
        height = 50;
    }

    @Override
    public char printCharacter() {
        System.out.println("Simbol = " + simbol + " Width = " + width + " Height = " + height);
        return simbol;
    }
}
