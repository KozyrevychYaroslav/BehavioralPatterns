package ai181.kozyrevych.visitor;

public class Programmer implements Human {
    @Override
    public void actions(BadMood badMood) {
        System.out.println("Writing code in a bad mood");
    }

    @Override
    public void actions(GoodMood goodMood) {
        System.out.println("Writing code enthusiastically");
    }
}
