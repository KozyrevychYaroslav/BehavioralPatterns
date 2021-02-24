package ai181.kozyrevych.tests;

import ai181.kozyrevych.strategy.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {
    @Test
    @DisplayName("Testing different strategies")
    public void testStrategies() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        ActContext actContext = new ActContext();
        ActStrategy actStrategy = new GameStrategy();

        actContext.setActStrategy(actStrategy);
        actContext.performAction();
        assertEquals("Playing games", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        actStrategy = new ProgramStrategy();
        actContext.setActStrategy(actStrategy);
        actContext.performAction();
        assertEquals("Programming", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        actStrategy = new RestStrategy();
        actContext.setActStrategy(actStrategy);
        actContext.performAction();
        assertEquals("Resting", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        System.setOut(System.out);
    }
}
