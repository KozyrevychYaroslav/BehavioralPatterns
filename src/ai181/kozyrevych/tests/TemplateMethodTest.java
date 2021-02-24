package ai181.kozyrevych.tests;

import ai181.kozyrevych.templateMethod.ComputerActionsTemplate;
import ai181.kozyrevych.templateMethod.Programmer;
import ai181.kozyrevych.templateMethod.UsualComputerUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateMethodTest {
    @Test
    @DisplayName("Testing diffMethod in ComputerActionsTemplate class")
    public void templateMethod() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        ComputerActionsTemplate template = new UsualComputerUser("Alex");
        template.doComputerWork();
        assertEquals("User: Alex\r\nTurn on the computer\r\nDo routine work\r\nTurn off the computer",
                outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        ComputerActionsTemplate template1 = new Programmer("Yaroslav");
        template1.doComputerWork();
        assertEquals("User: Yaroslav\r\nTurn on the computer\r\nWrite code\r\nTurn off the computer",
                outputStreamCaptor.toString().trim());
        System.setOut(System.out);
    }
}
