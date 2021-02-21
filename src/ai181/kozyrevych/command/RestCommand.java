package ai181.kozyrevych.command;

public class RestCommand implements ActCommand {
    private ActMoodReceiver actMoodReceiver;

    public RestCommand(ActMoodReceiver actMoodReceiver) {
        this.actMoodReceiver = actMoodReceiver;
    }

    @Override
    public void execute() {
        actMoodReceiver.moodToRest();
    }
}
