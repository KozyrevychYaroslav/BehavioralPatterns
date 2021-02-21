package ai181.kozyrevych.chainOfResponsibility;

public class UsualDay extends InviteController {
    public UsualDay(Priority priority) {
        super(priority);
    }

    @Override
    public String write() {
        return "Go for a walk alone";
    }
}
