package ua.cn.dmitrykrivenko.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class EnumerationIteratorAdapter implements Iterator {

    private final Enumeration enumeration;

    public EnumerationIteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

	@Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();

    }

	@Override
    public Object next() {
        return enumeration.nextElement();
    }

	@Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported");
    }
}
