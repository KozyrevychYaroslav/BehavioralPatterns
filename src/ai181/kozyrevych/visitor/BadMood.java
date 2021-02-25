package ai181.kozyrevych.visitor;

public class BadMood implements Mood {
    @Override
    public void accept(Human human) {
        human.actions(this);
    }
}
