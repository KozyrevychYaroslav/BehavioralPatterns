package ai181.kozyrevych.tests;

import ai181.kozyrevych.state.ProjectContext;
import ai181.kozyrevych.state.ProjectState;
import ai181.kozyrevych.state.RequirementsAnalysis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {

    @Test
    @DisplayName("Tesing ProjectContext class")
    public void testState() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        ProjectContext project = new ProjectContext();
        ProjectState projectState = new RequirementsAnalysis();
        project.setProjectState(projectState);

        project.workOnProject();
        assertEquals("Requirements analysis", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        project.workOnProject();
        assertEquals("Design", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        project.workOnProject();
        assertEquals("Development", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        project.workOnProject();
        assertEquals("Development", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        project.workOnProject();
        assertEquals("Development", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        project.workOnProject();
        assertEquals("Testing", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        project.workOnProject();
        assertEquals("Technical support", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        project.workOnProject();
        assertEquals("Requirements analysis", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }
}
