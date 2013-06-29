package ua.cn.dmitrykrivenko.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class EnumerationIteratorAdapter implements Iterator {

    private Enumeration enumeration;

    public EnumerationIteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();

    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException("Not supported");
    }
}
