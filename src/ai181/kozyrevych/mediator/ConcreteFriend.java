package ai181.kozyrevych.mediator;

import java.util.Date;

public class ConcreteFriend implements Friend {
    private FriendMediator friendMediator;
    private String name;

    public ConcreteFriend(FriendMediator friendMediator, String name) {
        this.friendMediator = friendMediator;
        this.name = name;
    }

    @Override
    public void callFriends(String invitation) {
        friendMediator.callFriends(invitation, this);
    }

    @Override
    public void getInvitation(String invitation) {
        System.out.println(name + " has got invitation: " + invitation);
    }
}
