package ua.cn.dmitrykrivenko.observer.own;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ValueDisplay implements Observer, Display {

    private int value;
    private Subject subject;

    public ValueDisplay(Subject s) {
        subject = s;
        subject.registerObserver(this);
    }

    public void update(int newValue) {
        value = newValue;
        display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public int getValue() {
        return value;
    }
}
