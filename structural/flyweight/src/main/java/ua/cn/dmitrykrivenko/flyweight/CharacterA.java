package ua.cn.dmitrykrivenko.flyweight;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CharacterA extends EnglishCharacter {

    public CharacterA() {
        simbol = 'A';
        width = 10;
        height = 20;
    }

    @Override
    public char printCharacter() {
        System.out.println("Simbol = " + simbol + " Width = " + width + " Height = " + height);
        return simbol;
    }
}
