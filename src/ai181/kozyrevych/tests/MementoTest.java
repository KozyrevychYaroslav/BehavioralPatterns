package ai181.kozyrevych.tests;

import ai181.kozyrevych.memento.DatabaseCaretaker;
import ai181.kozyrevych.memento.DatabaseOriginator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {

    @Test
    @DisplayName("Testing pattern Memento")
    public void mementoTest() {
        DatabaseCaretaker databaseCaretaker = new DatabaseCaretaker();
        DatabaseOriginator databaseOriginator = new DatabaseOriginator();

        databaseOriginator.setAuthorName("Author Name 1");
        databaseOriginator.setAuthorPassword("123456");
        databaseOriginator.setDatabaseVersion("v1.1");

        databaseCaretaker.setDatabaseMemento(databaseOriginator.save());
        assertEquals("DatabaseMemento{authorName='Author Name 1', authorPassword='123456', databaseVersion='v1.1'}",
                databaseCaretaker.getDatabaseMemento().toString());

        databaseOriginator.setDatabaseVersion("v1.2");
        assertEquals("v1.2", databaseOriginator.getDatabaseVersion());

        databaseOriginator.load(databaseCaretaker.getDatabaseMemento());
        assertEquals("v1.1", databaseOriginator.getDatabaseVersion());
    }
}
