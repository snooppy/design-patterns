package ua.cn.dmitrykrivenko.memento;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class MementoTest {

    @Test
    public void testMemento() {
        // caretaker
        DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();

        // originator
        DietInfo dietInfo = new DietInfo("Joe", 1, 95);
        System.out.println(dietInfo);

        dietInfo.setDayNumberAndWeight(2, 94);
        System.out.println(dietInfo);

        System.out.println("Saving state");
        dietInfoCaretaker.setMemento(dietInfo.save());

        dietInfo.setDayNumberAndWeight(3, 92);
        Assert.assertEquals(3, dietInfo.getDayNumber());
        Assert.assertEquals(92, dietInfo.getWeight());
        System.out.println(dietInfo);

        System.out.println("Restoring saved state");
        dietInfo.restore(dietInfoCaretaker.getMemento());
        System.out.println(dietInfo);

        Assert.assertEquals(2, dietInfo.getDayNumber());
        Assert.assertEquals(94, dietInfo.getWeight());
    }
}
