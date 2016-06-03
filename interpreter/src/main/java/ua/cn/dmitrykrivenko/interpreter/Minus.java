package ua.cn.dmitrykrivenko.interpreter;

import java.util.Map;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Minus implements Expression {

    private final Expression leftOperand;
    private final Expression rightOperand;

    public Minus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}
