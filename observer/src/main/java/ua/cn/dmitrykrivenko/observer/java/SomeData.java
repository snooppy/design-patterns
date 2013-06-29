package ua.cn.dmitrykrivenko.observer.java;

import java.util.Observable;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class SomeData extends Observable {

    private int value;

    public void valueHasChanged() {
        setChanged();
        notifyObservers();
    }

    public void setValue(int newValue) {
        value = newValue;
        valueHasChanged();
    }

    public int getValue() {
        return value;
    }
}
