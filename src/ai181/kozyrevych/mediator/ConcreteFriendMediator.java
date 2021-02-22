package ai181.kozyrevych.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteFriendMediator implements FriendMediator {
    private List<Friend> friends = new ArrayList<>();

    public void addFriend(Friend friend) {
        friends.add(friend);
    }

    @Override
    public void callFriends(String invitation, Friend friend) {
        friends.stream().filter(i -> i != friend).forEach(i -> i.getInvitation(invitation));
    }
}
