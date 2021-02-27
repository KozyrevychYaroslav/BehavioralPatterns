package ai181.kozyrevych.memento;

import java.util.Stack;

public class DatabaseCaretaker {
    private Stack<DatabaseMemento> databaseMemento = new Stack<>();

    public DatabaseMemento getDatabaseMemento() {
        return databaseMemento.pop();
    }

    public void setDatabaseMemento(DatabaseMemento databaseMemento) {
        this.databaseMemento.push(databaseMemento);
    }
}
