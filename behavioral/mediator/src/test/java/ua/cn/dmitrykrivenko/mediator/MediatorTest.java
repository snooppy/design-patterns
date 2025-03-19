package ua.cn.dmitrykrivenko.mediator;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class MediatorTest {

    @Test
    public void testMediator() {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        colleague1.send("Hello World");
        colleague2.send("Hello");

        Assert.assertEquals("Hello", colleague1.getReceivedMessage());
        Assert.assertEquals("Hello World", colleague2.getReceivedMessage());
    }
}
