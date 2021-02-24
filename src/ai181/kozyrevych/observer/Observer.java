package ai181.kozyrevych.observer;

import java.util.List;

public interface Observer {
    public void handleNotification(List<String> notifications);
}
