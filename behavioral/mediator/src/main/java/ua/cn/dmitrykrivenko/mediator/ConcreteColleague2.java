package ua.cn.dmitrykrivenko.mediator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Concrete Colleague 2 Received: " + message);
        receivedMessage = message;
    }
}
