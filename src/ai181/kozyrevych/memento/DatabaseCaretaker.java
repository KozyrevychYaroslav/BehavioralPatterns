package ai181.kozyrevych.memento;

public class DatabaseCaretaker {
    private DatabaseMemento databaseMemento;

    public DatabaseMemento getDatabaseMemento() {
        return databaseMemento;
    }

    public void setDatabaseMemento(DatabaseMemento databaseMemento) {
        this.databaseMemento = databaseMemento;
    }
}
