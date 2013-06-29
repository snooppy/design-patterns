package ua.cn.dmitrykrivenko.interpreter;

import java.util.Map;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Number implements Expression {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}
