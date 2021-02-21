package ai181.kozyrevych.command;

public class ProgramCommand implements ActCommand {
    private ActMoodReceiver actMoodReceiver;

    public ProgramCommand(ActMoodReceiver actMoodReceiver) {
        this.actMoodReceiver = actMoodReceiver;
    }

    @Override
    public void execute() {
        actMoodReceiver.moodToProgram();
    }
}
