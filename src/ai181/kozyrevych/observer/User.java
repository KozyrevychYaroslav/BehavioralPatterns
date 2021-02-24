package ai181.kozyrevych.observer;

import java.util.List;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleNotification(List<String> notifications) {
        System.out.println("User: " + name + "\nChanged notifications:");
        notifications.forEach(System.out::println);
        System.out.println();
    }
}
