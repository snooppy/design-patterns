package ua.cn.dmitrykrivenko.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Adapts Enumeration to Iterator.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class EnumerationIteratorAdapter implements Iterator<String> {

    private final Enumeration<String> enumeration;

    public EnumerationIteratorAdapter(Enumeration<String> enumeration) {
        this.enumeration = enumeration;
    }

	@Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

	@Override
    public String next() {
        return enumeration.nextElement();
    }

	@Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported");
    }
}
