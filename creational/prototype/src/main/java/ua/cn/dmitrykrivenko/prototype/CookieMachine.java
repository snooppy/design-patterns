package ua.cn.dmitrykrivenko.prototype;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CookieMachine {

    private final Cookie cookie; // Could have been a private Cloneable cookie.

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return this.cookie.clone();
    }
}
