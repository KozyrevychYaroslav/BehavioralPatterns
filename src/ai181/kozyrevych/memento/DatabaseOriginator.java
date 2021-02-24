package ai181.kozyrevych.memento;

public class DatabaseOriginator {
    private String authorName;
    private String authorPassword;
    private String databaseVersion;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPassword() {
        return authorPassword;
    }

    public void setAuthorPassword(String authorPassword) {
        this.authorPassword = authorPassword;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    public DatabaseMemento save() {
        return new DatabaseMemento(authorName, authorPassword, databaseVersion);
    }

    public void load(DatabaseMemento databaseMemento) {
        this.authorName = databaseMemento.getAuthorName();
        this.authorPassword = databaseMemento.getAuthorPassword();
        this.databaseVersion = databaseMemento.getDatabaseVersion();
    }
}
