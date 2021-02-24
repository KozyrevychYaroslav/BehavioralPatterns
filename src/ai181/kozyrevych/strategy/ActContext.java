package ai181.kozyrevych.strategy;

public class ActContext {
    private ActStrategy actStrategy;

    public void performAction() {
        actStrategy.performAction();
    }

    public void setActStrategy(ActStrategy actStrategy) {
        this.actStrategy = actStrategy;
    }
}
