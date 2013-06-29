package ua.cn.dmitrykrivenko.interpreter;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class InterpreterTest {

    @Test
    public void testInterpreter() {
        String expression = "w x z - +";//=x-z+w
        Evaluator sentence = new Evaluator(expression);
        Map<String, Expression> variables = new HashMap<String, Expression>();

        variables.put("w", new Number(10));
        variables.put("x", new Number(3));
        variables.put("z", new Number(7));

        int result = sentence.interpret(variables);
        System.out.println("w x z - + = " + result);

        Assert.assertEquals(6, result);
    }
}
