package ua.cn.dmitrykrivenko.mediator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public abstract class Colleague {

    private final Mediator mediator;
    protected String receivedMessage;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getReceivedMessage() {
        return receivedMessage;
    }

    public abstract void receive(String message);
}
