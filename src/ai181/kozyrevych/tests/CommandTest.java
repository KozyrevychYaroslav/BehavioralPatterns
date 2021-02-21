package ai181.kozyrevych.tests;

import ai181.kozyrevych.command.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {
    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private ActMoodReceiver actMoodReceiver = new ActMoodReceiver();
    private ActCommand actPlayingGames = new GamesCommand(actMoodReceiver);
    private ActCommand actProgramming = new ProgramCommand(actMoodReceiver);
    private ActCommand actResting = new RestCommand(actMoodReceiver);
    private ActInvoker actInvoker = new ActInvoker(actPlayingGames, actProgramming, actResting);

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
    @DisplayName("Testing GamesCommand with using actInvoker")
    public void gamesCommand() {
        actInvoker.playGames();
        assertEquals("Playing games", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Testing RestCommand with using actInvoker")
    public void restCommand() {
        actInvoker.rest();
        assertEquals("Resting", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Testing ProgramCommand with using actInvoker")
    public void programCommand() {
        actInvoker.program();
        assertEquals("Programming", outputStreamCaptor.toString().trim());
    }
}
