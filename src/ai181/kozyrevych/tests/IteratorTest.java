package ai181.kozyrevych.tests;

import ai181.kozyrevych.iterator.MyIterator;
import ai181.kozyrevych.iterator.ZooAnimals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class IteratorTest {

    private int i = 0;
    private String[] animals = {"cat", "dog", "hamster", "rabbit"};
    private ZooAnimals zooAnimals = new ZooAnimals(animals);
    private MyIterator iterator = zooAnimals.getIterator();

    @Test
    @DisplayName("Testing Iterator ")
    public void iteratorTest() {

        while (iterator.hasNext()) {
            switch (i) {
                case 0:
                    assertEquals("cat", iterator.next());
                    break;
                case 1:
                    assertEquals("dog", iterator.next());
                    break;
                case 2:
                    assertEquals("hamster", iterator.next());
                    break;
                case 3:
                    assertEquals("rabbit", iterator.next());
                    break;
                default:
                    fail("Incorrect i: " + i);
            }
            i++;
        }
        assertEquals(4, i);

        i = 3;
        while (iterator.hasPrevious()) {
            switch (i) {
                case 0:
                    assertEquals("cat", iterator.previous());
                    break;
                case 1:
                    assertEquals("dog", iterator.previous());
                    break;
                case 2:
                    assertEquals("hamster", iterator.previous());
                    break;
                case 3:
                    assertEquals("rabbit", iterator.previous());
                    break;
                default:
                    fail("Incorrect i: " + i);
            }
            i--;
        }
        assertEquals(-1, i);
    }

}
