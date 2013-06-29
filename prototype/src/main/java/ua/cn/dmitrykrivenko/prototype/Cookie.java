package ua.cn.dmitrykrivenko.prototype;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public abstract class Cookie implements Cloneable{

    @Override
    public Cookie clone() throws CloneNotSupportedException {
        // call Object.clone()
        Cookie copy = (Cookie) super.clone();

        //In an actual implementation of this pattern you might now change references to
        //the expensive to produce parts from the copies that are held inside the prototype.

        return copy;
    }
}
