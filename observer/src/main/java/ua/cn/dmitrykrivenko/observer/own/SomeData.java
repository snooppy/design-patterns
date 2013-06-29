package ua.cn.dmitrykrivenko.observer.own;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class SomeData implements Subject {

    private List<Observer> observers;
    private int value;

    public SomeData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void valueHasChanged() {
        notifyObservers();
    }

    public void setValue(int newValue) {
        value = newValue;
        valueHasChanged();
    }
}
