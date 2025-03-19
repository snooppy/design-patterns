package ua.cn.dmitrykrivenko.mediator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Concrete Colleague 1 Received: " + message);
        receivedMessage = message;
    }
}
