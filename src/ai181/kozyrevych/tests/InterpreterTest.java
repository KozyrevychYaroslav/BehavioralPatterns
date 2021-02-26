package ai181.kozyrevych.tests;

import ai181.kozyrevych.interpreter.ContextExpression;
import ai181.kozyrevych.interpreter.Expression;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterpreterTest {
    @Test
    @DisplayName("Testing ContextExpression interpreter")
    public void interpreterTest() {
        ContextExpression contextExpression = new ContextExpression();
        Expression expression = contextExpression.evaluate("1+3-2");
        assertEquals(2, expression.interpret());
        expression = contextExpression.evaluate("11-2+3");
        assertEquals(12, expression.interpret());
        expression = contextExpression.evaluate("10+12-8");
        assertEquals(14, expression.interpret());
    }
}
