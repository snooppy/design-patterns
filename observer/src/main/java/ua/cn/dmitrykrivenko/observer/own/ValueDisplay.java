package ua.cn.dmitrykrivenko.observer.own;

import ua.cn.dmitrykrivenko.observer.Display;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ValueDisplay implements Observer, Display {

    private int value;
    private final Subject subject;

    public ValueDisplay(Subject s) {
        subject = s;
        subject.registerObserver(this);
    }

    @Override
    public void update(int newValue) {
        value = newValue;
        display();
    }

    @Override
    public void display() {
        System.out.println("Value: " + value);
    }

    public int getValue() {
        return value;
    }
}
