package ai181.kozyrevych.strategy;

public class RestStrategy implements ActStrategy {
    @Override
    public void performAction() {
        System.out.println("Resting");
    }
}
