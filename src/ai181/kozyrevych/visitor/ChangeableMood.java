package ai181.kozyrevych.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeableMood implements Mood {
    @Override
    public void accept(Human human) {
        Arrays.asList(new BadMood(), new GoodMood()).forEach(i -> i.accept(human));
    }
}
