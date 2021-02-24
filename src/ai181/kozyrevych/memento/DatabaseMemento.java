package ai181.kozyrevych.memento;

public class DatabaseMemento {
    private final String authorName;
    private final String authorPassword;
    private final String databaseVersion;

    public DatabaseMemento(String authorName, String authorPassword, String databaseVersion) {
        this.authorName = authorName;
        this.authorPassword = authorPassword;
        this.databaseVersion = databaseVersion;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorPassword() {
        return authorPassword;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    @Override
    public String toString() {
        return "DatabaseMemento{" +
                "authorName='" + authorName + '\'' +
                ", authorPassword='" + authorPassword + '\'' +
                ", databaseVersion='" + databaseVersion + '\'' +
                '}';
    }
}
