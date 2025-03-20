package ua.cn.dmitrykrivenko.mediator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Mediator {

    void addColleague(Colleague colleague);

    void send(String message, Colleague colleague);
}
