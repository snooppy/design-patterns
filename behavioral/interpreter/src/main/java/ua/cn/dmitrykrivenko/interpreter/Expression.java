package ua.cn.dmitrykrivenko.interpreter;

import java.util.Map;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Expression {
    int interpret(Map<String, Expression> variables);
}
