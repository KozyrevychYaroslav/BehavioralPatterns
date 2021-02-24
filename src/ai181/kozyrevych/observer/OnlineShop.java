package ai181.kozyrevych.observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements Observable {
    private List<Observer> users = new ArrayList<>();
    private List<String> notifications = new ArrayList<>();

    @Override
    public void addUser(Observer user) {
        users.add(user);
    }

    @Override
    public void deleteUser(Observer user) {
        users.remove(user);
    }

    public void addNotification(String notification) {
        notifications.add(notification);
        notifyUsers();
    }

    public void deleteNotification(String notification) {
        notifications.remove(notification);
        notifyUsers();
    }

    @Override
    public void notifyUsers() {
        users.forEach(i -> i.handleNotification(notifications));
    }
}
