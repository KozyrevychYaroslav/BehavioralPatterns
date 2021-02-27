package ai181.kozyrevych.tests;

import ai181.kozyrevych.visitor.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTest {
    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Mood mood;
    private Human human;

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
    @DisplayName("Testing UsualHuman visitor")
    public void usualHuman() {
        human = new UsualHuman();

        mood = new BadMood();
        mood.accept(human);
        assertEquals("Listening to music", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        mood = new GoodMood();
        mood.accept(human);
        assertEquals("Doing some work", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        mood = new ChangeableMood();
        mood.accept(human);
        assertEquals("Listening to music\r\nDoing some work", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Testing Programmer visitor")
    public void programmer() {
        human = new Programmer();

        mood = new BadMood();
        mood.accept(human);
        assertEquals("Writing code in a bad mood", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        mood = new GoodMood();
        mood.accept(human);
        assertEquals("Writing code enthusiastically", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        mood = new ChangeableMood();
        mood.accept(human);
        assertEquals("Writing code in a bad mood\r\nWriting code enthusiastically", outputStreamCaptor.toString().trim());
    }
}
