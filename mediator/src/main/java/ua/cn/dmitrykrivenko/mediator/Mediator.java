package ua.cn.dmitrykrivenko.mediator;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface Mediator {

    public void send(String message, Colleague colleague);
}
