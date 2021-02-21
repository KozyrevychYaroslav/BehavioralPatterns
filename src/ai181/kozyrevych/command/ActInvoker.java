package ai181.kozyrevych.command;


public class ActInvoker {
    private ActCommand actPlayingGames;
    private ActCommand actProgramming;
    private ActCommand actResting;

    public ActInvoker(ActCommand actPlayingGames, ActCommand actProgramming, ActCommand actResting) {
        this.actPlayingGames = actPlayingGames;
        this.actProgramming = actProgramming;
        this.actResting = actResting;
    }

    public void playGames() {
        actPlayingGames.execute();
    }

    public void program() {
        actProgramming.execute();
    }

    public void rest() {
        actResting.execute();
    }
}
