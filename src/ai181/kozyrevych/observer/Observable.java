package ai181.kozyrevych.observer;

public interface Observable {
    public void addUser(Observer user);

    public void deleteUser(Observer user);

    public void notifyUsers();
}
