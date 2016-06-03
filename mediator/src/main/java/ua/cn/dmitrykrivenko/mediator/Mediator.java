package ua.cn.dmitrykrivenko.mediator;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface Mediator {

    void addColleague(Colleague collegue);

    void send(String message, Colleague colleague);
}
