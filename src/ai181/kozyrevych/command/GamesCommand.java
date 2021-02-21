package ai181.kozyrevych.command;

public class GamesCommand implements ActCommand {
    private ActMoodReceiver actMoodReceiver;

    public GamesCommand(ActMoodReceiver actMoodReceiver) {
        this.actMoodReceiver = actMoodReceiver;
    }

    @Override
    public void execute() {
        actMoodReceiver.moodToPlayGames();
    }
}
