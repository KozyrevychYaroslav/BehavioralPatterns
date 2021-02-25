package ai181.kozyrevych.visitor;

public class UsualHuman implements Human {
    @Override
    public void actions(BadMood badMood) {
        System.out.println("Listening to music");
    }

    @Override
    public void actions(GoodMood goodMood) {
        System.out.println("Doing some work");
    }
}
