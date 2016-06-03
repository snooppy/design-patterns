package ua.cn.dmitrykrivenko.memento;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class DietInfoCaretaker {

    private Object objMemento;

    public void setMemento(Object objMemento) {
        this.objMemento = objMemento;
    }

    public Object getMemento() {
        return objMemento;
    }
}
