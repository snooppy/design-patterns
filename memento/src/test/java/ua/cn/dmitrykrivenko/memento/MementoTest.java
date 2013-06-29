package ua.cn.dmitrykrivenko.memento;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
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
        dietInfoCaretaker.saveState(dietInfo);

        dietInfo.setDayNumberAndWeight(3, 92);
        System.out.println(dietInfo);

        System.out.println("Restoring saved state");
        dietInfoCaretaker.restoreState(dietInfo);
        System.out.println(dietInfo);

        Assert.assertTrue(dietInfo.getDayNumber() == 2);
        Assert.assertTrue(dietInfo.getWeight() == 94);
    }
}
