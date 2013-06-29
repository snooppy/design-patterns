package ua.cn.dmitrykrivenko.memento;

/**
 * Originator - object whose state we want to save.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class DietInfo {

    private String personName;
    private int dayNumber;
    private int weight;

    public DietInfo(String personName, int dayNumber, int weight) {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    public void setDayNumberAndWeight(int dayNumber, int weight) {
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    public Object save() {
        return new Memento(personName, getDayNumber(), getWeight());
    }

    public void restore(Object objMemento) {
        if (objMemento instanceof Memento) {
            Memento memento = (Memento) objMemento;
            personName = memento.mementoPersonName;
            dayNumber = memento.mementoDayNumber;
            weight = memento.mementoWeight;
        }
    }

    /**
     * @return the dayNumber
     */
    public int getDayNumber() {
        return dayNumber;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Name: " + personName + ", day number: " + getDayNumber() + ", weight: " + getWeight();
    }

    /**
     * Memento - object that stores the saved state of the originator.
     */
    private class Memento {

        String mementoPersonName;
        int mementoDayNumber;
        int mementoWeight;

        public Memento(String personName, int dayNumber, int weight) {
            mementoPersonName = personName;
            mementoDayNumber = dayNumber;
            mementoWeight = weight;
        }
    }
}
