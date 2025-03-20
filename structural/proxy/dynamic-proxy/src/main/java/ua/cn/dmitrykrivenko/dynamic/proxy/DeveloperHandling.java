package ua.cn.dmitrykrivenko.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class DeveloperHandling implements InvocationHandler {

    private final Developer employee;

    public DeveloperHandling(Developer employee) {
        this.employee = employee;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get") || method.getName().equals("setName")) {
                return method.invoke(employee, args);
            } else if (method.getName().equals("setRole")) {
                throw new IllegalAccessException();
            } else if (method.getName().equals("setSalary")) {
                throw new IllegalAccessException();
            } else if (method.getName().equals("setRating")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            System.out.println(e);
        }
        return null;
    }
}
