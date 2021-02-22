package ai181.kozyrevych.tests;

import ai181.kozyrevych.iterator.MyIterator;
import ai181.kozyrevych.iterator.ZooAnimals;
import ai181.kozyrevych.mediator.ConcreteFriend;
import ai181.kozyrevych.mediator.ConcreteFriendMediator;
import ai181.kozyrevych.mediator.Friend;
import ai181.kozyrevych.mediator.FriendMediator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class MediatorTest {

    @Test
    @DisplayName("Testing ConcreteFriendMediator")
    public void mediatorTest() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        ConcreteFriendMediator friendMediator = new ConcreteFriendMediator();
        Friend friend1 = new ConcreteFriend(friendMediator, "Alex");
        Friend friend2 = new ConcreteFriend(friendMediator, "Max");
        Friend friend3 = new ConcreteFriend(friendMediator, "Anna");
        Friend friend4 = new ConcreteFriend(friendMediator, "Yaroslav");
        friendMediator.addFriend(friend1);
        friendMediator.addFriend(friend2);
        friendMediator.addFriend(friend3);
        friendMediator.addFriend(friend4);

        friend1.callFriends("Some invitation");
        assertEquals("Max has got invitation: Some invitation\r\n"+
                               "Anna has got invitation: Some invitation\r\n"+
                               "Yaroslav has got invitation: Some invitation", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        friend2.callFriends("Another one invitation");
        assertEquals("Alex has got invitation: Another one invitation\r\n"+
                "Anna has got invitation: Another one invitation\r\n"+
                "Yaroslav has got invitation: Another one invitation", outputStreamCaptor.toString().trim());
        System.setOut(System.out);
    }
}
