package ai181.kozyrevych.tests;

import ai181.kozyrevych.chainOfResponsibility.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResponsibilityTest {
    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void configMethodBefore() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void configMethodAfter() {
        System.setOut(System.out);
        outputStreamCaptor.reset();
    }

    @Test
    @DisplayName("Testing UsualDay class")
    public void usualDayTest() {
        InviteController controller = new UsualDay(Priority.USUAL_DAY);

        controller.writeMessage("It's usual day", Priority.USUAL_DAY);
        assertEquals("Go for a walk alone: It's usual day", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        controller.writeMessage("Walk mood", Priority.WALK_MOOD);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Testing WalkDay class")
    public void walkDayTest() {
        InviteController controller = new WalkDay(Priority.WALK_MOOD);

        controller.writeMessage("Walk mood", Priority.WALK_MOOD);
        assertEquals("Invite one friend: Walk mood", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        controller.writeMessage("Birthday", Priority.BIRTHDAY);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Testing Birthday class")
    public void birthdayTest() {
        InviteController controller = new Birthday(Priority.BIRTHDAY);
        controller.writeMessage("Birthday", Priority.BIRTHDAY);
        assertEquals("Invite all my friends: Birthday", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Testing chain of classes")
    public void chainTest() {
        InviteController controller = new UsualDay(Priority.USUAL_DAY);
        InviteController controller1 = new WalkDay(Priority.WALK_MOOD);
        InviteController controller2 = new Birthday(Priority.BIRTHDAY);

        controller.setNextController(controller1);
        controller1.setNextController(controller2);

        controller.writeMessage("It's usual day", Priority.USUAL_DAY);
        assertEquals("Go for a walk alone: It's usual day", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        controller.writeMessage("Walk mood", Priority.WALK_MOOD);
        assertEquals("Invite one friend: Walk mood", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        controller.writeMessage("Birthday!!!", Priority.BIRTHDAY);
        assertEquals("Invite all my friends: Birthday!!!", outputStreamCaptor.toString().trim());
    }
}
