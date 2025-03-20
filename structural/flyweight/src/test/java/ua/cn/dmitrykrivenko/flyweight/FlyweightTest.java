package ua.cn.dmitrykrivenko.flyweight;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class FlyweightTest {

    @Test
    public void testFlyweight() {
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        EnglishCharacter c = factory.getCharacter(1);
        Assert.assertEquals('A', c.printCharacter());
        Assert.assertEquals('B', factory.getCharacter(2).printCharacter());
        Assert.assertEquals('C', factory.getCharacter(3).printCharacter());

        //getting already created object
        Assert.assertSame(factory.getCharacter(1), c);
    }
}
