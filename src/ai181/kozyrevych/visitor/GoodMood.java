package ai181.kozyrevych.visitor;

public class GoodMood implements Mood {
    @Override
    public void accept(Human human) {
        human.actions(this);
    }
}
