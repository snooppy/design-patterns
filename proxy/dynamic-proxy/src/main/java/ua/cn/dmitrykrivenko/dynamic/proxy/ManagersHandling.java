package ua.cn.dmitrykrivenko.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class ManagersHandling implements InvocationHandler {

    private final Developer employee;

    public ManagersHandling(Developer employee) {
        this.employee = employee;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(employee, args);
            } else if (method.getName().startsWith("setName")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(employee, args);
            }
        } catch (InvocationTargetException e) {
            System.out.println(e);
        }
        return null;
    }
}
