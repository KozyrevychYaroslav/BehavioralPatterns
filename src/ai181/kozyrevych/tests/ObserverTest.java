package ai181.kozyrevych.tests;

import ai181.kozyrevych.observer.Observer;
import ai181.kozyrevych.observer.OnlineShop;
import ai181.kozyrevych.observer.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    static Observer user1 = new User("Alex");
    static Observer user2 = new User("Yaroslav");
    static Observer user3 = new User("Helen");
    static Observer user4 = new User("Andrew");
    static OnlineShop onlineShop = new OnlineShop();

    @BeforeAll
    public static void configure() {
        onlineShop.addUser(user1);
        onlineShop.addUser(user2);
        onlineShop.addUser(user3);
        onlineShop.addUser(user4);
        onlineShop.addNotification("notification N1");
        onlineShop.addNotification("notification N2");
    }


    @Test
    @DisplayName("Testing deleteNotification method in OnlineShop")
    public void deleteNotificationTest() {
        System.out.println("Deletion");
        onlineShop.deleteNotification("notification N1");
        onlineShop.deleteNotification("notification N2");
    }
}
