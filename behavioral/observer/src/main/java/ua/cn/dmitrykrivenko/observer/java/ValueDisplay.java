package ua.cn.dmitrykrivenko.observer.java;

import java.util.Observable;
import java.util.Observer;
import ua.cn.dmitrykrivenko.observer.Display;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class ValueDisplay implements Observer, Display {

    Observable observable;
    private int value;

    public ValueDisplay(Observable o) {
        observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SomeData someData) {
            value = someData.getValue();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Value: " + value);
    }

    public int getValue() {
        return value;
    }
}
