package ua.cn.dmitrykrivenko.observer.own;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
